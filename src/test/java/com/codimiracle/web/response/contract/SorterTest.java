package com.codimiracle.web.response.contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SorterTest {

    @Test
    void getFieldWithCamelCase() {
        Sorter sorter = new Sorter();
        sorter.setField("helloWorld");
        assertEquals("hello_world", sorter.getField());
    }

    @Test
    void getFieldWithLowerCase() {
        Sorter sorter = new Sorter();
        sorter.setField("helloworld");
        assertEquals("helloworld", sorter.getField());
    }

    @Test
    void getFieldWithUpperCase() {
        Sorter sorter = new Sorter();
        sorter.setField("HELLOWORLD");
        assertEquals("_h_e_l_l_o_w_o_r_l_d", sorter.getField());
    }

    @Test
    void testSetOrderWithAscend() {
        Sorter sorter = new Sorter();
        sorter.setOrder(Sorter.ORDER_ASCEND);
        assertEquals(Sorter.ORDER_ASCEND, sorter.getOrder());
    }

    @Test
    void testSetOrderWithDescend() {
        Sorter sorter = new Sorter();
        sorter.setOrder(Sorter.ORDER_DESCEND);
        assertEquals(Sorter.ORDER_DESCEND, sorter.getOrder());
    }

    @Test
    void testSetOrderWitOtherValue() {
        assertThrows(RuntimeException.class, () -> {
            Sorter sorter = new Sorter();
            sorter.setOrder("some value");
        });
    }
}