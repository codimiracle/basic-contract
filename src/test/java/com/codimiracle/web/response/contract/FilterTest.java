package com.codimiracle.web.response.contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    @Test
    void testFilter() {
        String[] value = new String[]{"World"};
        Filter filter = new Filter();
        filter.put("Hello", value);
        assertEquals(value, filter.get("Hello"));
    }
}