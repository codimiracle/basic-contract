package com.codimiracle.web.response.contract;
/*
 * MIT License
 *
 * Copyright (c) 2020 Codimiracle
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, Publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * Sorter class
 * @author Codimiracle
 */
public class Sorter {
    public static final String ORDER_DESCEND = "descend";
    public static final String ORDER_ASCEND = "ascend";
    /**
     * entity field name
     */
    @Setter
    private String field;

    /**
     * descend or ascend order
     */
    @Getter
    private String order;

    /**
     * convert camel case to underline naming style for database
     */
    public String getField() {
        return Optional.ofNullable(this.field).map((s) -> s.replaceAll("([A-Z])", "_$1").toLowerCase()).orElse(null);
    }

    public void setOrder(String order) {
        if (ORDER_DESCEND.equals(order) || ORDER_ASCEND.equals(order)) {
            this.order = order;
            return;
        }
        throw new RuntimeException("order value must be descend or ascend");
    }
}
