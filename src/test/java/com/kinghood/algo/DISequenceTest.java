package com.kinghood.algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DISequenceTest {
    @Test
    public void numPermsDISequence() {
        DISequence diSequence = new DISequence();
        assertEquals(1, diSequence.numPermsDISequence("DDDDD"));
        assertEquals(1, diSequence.numPermsDISequence("III"));
        assertEquals(5, diSequence.numPermsDISequence("DID"));
        assertEquals(5, diSequence.numPermsDISequence("IDI"));
        assertEquals(598004198, diSequence.numPermsDISequence("DIDIDIDDIIDDID"));


    }

}