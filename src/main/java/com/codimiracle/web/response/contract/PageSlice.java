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
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * represent a part of long page
 *
 * @param <T> Element Type
 */
@Data
public class PageSlice<T> {
    /**
     * page number
     */
    private int page;
    /**
     * how much one page should contain (if possible)
     */
    private int limit;
    /**
     * source list.
     */
    private List<T> list;
    /**
     * total elements
     */
    private long total;

    public PageSlice() {
        this.page = 1;
        this.limit = 10;
        this.total = 0;
        this.list = new ArrayList<>();
    }

    /**
     * make list as a {@link PageSlice}
     * @param list
     */
    public PageSlice(List<T> list) {
        this.page = 1;
        this.limit = list.size();
        this.list = list;
        this.total = list.size();
    }
}
