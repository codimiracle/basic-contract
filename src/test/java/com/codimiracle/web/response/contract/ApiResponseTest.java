package com.codimiracle.web.response.contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiResponseTest {
    @Test
    void testCreateApiResponse() {
        ApiResponse apiResponse = new ApiResponse<>(101, "hello", "world");
        assertEquals(101, apiResponse.getCode());
        assertEquals("hello", apiResponse.getMessage());
        assertEquals("world", apiResponse.getData());
    }
}