package com.kinghood.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SuperEggDropTest {

    @Test
    public void getDrops() {
        SuperEggDrop eggDrop = new SuperEggDrop();
        assertEquals(2, eggDrop.getDrops(1, 2));
        assertEquals(14, eggDrop.getDrops(2, 100));
        assertEquals(4, eggDrop.getDrops(3, 14));
    }
}