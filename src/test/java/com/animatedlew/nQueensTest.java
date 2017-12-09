package com.animatedlew;

import junit.framework.TestCase;
import org.junit.*;
import java.util.Arrays;

public class nQueensTest extends TestCase {
    int count(int[][] grid) {
        return Arrays.stream(grid).mapToInt(row -> Arrays.stream(row).sum()).sum();
    }
    @Test
    public void testNQueens() {
        assertEquals("01 Queens",  1, count(new nQueensSolver( 1).solve()));
        assertEquals("04 Queens",  4, count(new nQueensSolver( 4).solve()));
        assertEquals("05 Queens",  5, count(new nQueensSolver( 5).solve()));
        assertEquals("06 Queens",  6, count(new nQueensSolver( 6).solve()));
        assertEquals("07 Queens",  7, count(new nQueensSolver( 7).solve()));
        assertEquals("08 Queens",  8, count(new nQueensSolver( 8).solve()));
        assertEquals("09 Queens",  9, count(new nQueensSolver( 9).solve()));
        assertEquals("10 Queens", 10, count(new nQueensSolver(10).solve()));
    }
}
