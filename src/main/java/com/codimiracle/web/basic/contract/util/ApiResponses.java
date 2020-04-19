package com.codimiracle.web.basic.contract.util;

import com.codimiracle.web.basic.contract.ApiResponse;

public class ApiResponses {
    private ApiResponses() throws InstantiationException {
        throw new InstantiationException("Can not instantiate ApiResponses class.");
    }

    public static <T> ApiResponse<T> message(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }

    public static <T> ApiResponse<T> data(T data) {
        return new ApiResponse<>(0, "success", data);
    }
}
