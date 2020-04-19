package com.codimiracle.web.basic.contract.util;

import com.codimiracle.web.basic.contract.ApiResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiResponsesTest {

    @Test
    void message() {
        ApiResponse<Object> message = ApiResponses.message(200, "页面找到！");
        assertEquals(200, message.getCode());
        assertEquals("页面找到！", message.getMessage());
    }

    @Test
    void data() {
        ApiResponse<String> data = ApiResponses.data("Hello world");
        assertEquals(0, data.getCode());
        assertEquals("success", data.getMessage());
        assertEquals("Hello world", data.getData());
    }
}