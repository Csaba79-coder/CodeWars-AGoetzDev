package org.alexgdev.codewars;

import static org.junit.Assert.*;

import org.alexgdev.codewars.fourkyu.MiddlePermutation;
import org.junit.Test;

public class MiddlePermutationTest {

	@Test
    public void basicTests() {
        assertEquals("bac", MiddlePermutation.findMidPerm("abc"));
        assertEquals("bdca", MiddlePermutation.findMidPerm("abcd"));
        assertEquals("cbxda", MiddlePermutation.findMidPerm("abcdx"));
        assertEquals("cxgdba", MiddlePermutation.findMidPerm("abcdxg"));
        assertEquals("dczxgba", MiddlePermutation.findMidPerm("abcdxgz"));
    }

}
