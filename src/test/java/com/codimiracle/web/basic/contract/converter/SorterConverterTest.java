package com.codimiracle.web.basic.contract.converter;

import com.codimiracle.web.basic.contract.Sorter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class SorterConverterTest {

    @Autowired
    private SorterConverter converter;

    @Test
    void convert() throws JsonProcessingException {
        Sorter sorter = new Sorter();
        sorter.setOrder(Sorter.ORDER_DESCEND);
        sorter.setField("field");
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(sorter);
        Sorter result = converter.convert(value);
        assertEquals(sorter, result);
    }

    @Test
    void convertWithError() {
        String source = "A{}A";
        Sorter sorter = converter.convert(source);
        assertNull(sorter);
    }
}