package com.codimiracle.web.response.contract.converter;

import com.codimiracle.web.response.contract.Filter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FilterConverterTest {

    @Autowired
    FilterConverter converter;
    @Test
    void convert() throws JsonProcessingException {
        Filter filter = new Filter();
        filter.put("Hello", new String[] {"world"});
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(filter);
        Filter result = converter.convert(value);
        assertArrayEquals(filter.get("Hello"), result.get("Hello"));
        assertEquals(filter.size(), result.size());
    }

    @Test
    void convertWithError() {
        String source = "A{}A";
        Filter filter = converter.convert(source);
        assertNull(filter);
    }

}