package com.codimiracle.web.response.contract;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PageSliceTest {

    @Test
    void testCreatePageSlice() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        PageSlice<String> slice = new PageSlice<>(list);
        assertEquals(list.size(), slice.getLimit());
        assertEquals(list, slice.getList());
        assertEquals(1, slice.getPage());
        assertEquals(list.size(), slice.getTotal());
    }

    @Test
    void testCreatePageSliceEmpty() {
        PageSlice<String> slice = new PageSlice<>();
        assertNotNull(slice.getList());
        assertEquals(1, slice.getPage());
        assertEquals(0, slice.getTotal());
        assertEquals(10, slice.getLimit());
    }
}