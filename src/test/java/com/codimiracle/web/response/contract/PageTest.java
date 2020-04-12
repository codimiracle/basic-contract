package com.codimiracle.web.response.contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageTest {

    @Test
    void getOffsetWithPageZero() {
        Page page = new Page();
        page.setPage(0);
        page.setLimit(10);
        assertEquals(0, page.getOffset());
    }

    @Test
    void getOffsetWithNegativeNumber() {
        Page page = new Page();
        page.setPage(-1);
        page.setLimit(10);
        assertEquals(0, page.getOffset());
    }

    @Test
    void getOffsetWithPositiveNumber() {
        Page page = new Page();
        page.setPage(1);
        page.setLimit(10);
        assertEquals(0, page.getOffset());
        page.setPage(2);
        assertEquals(10, page.getOffset());
    }
}