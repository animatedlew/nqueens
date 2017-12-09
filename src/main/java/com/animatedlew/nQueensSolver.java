package com.animatedlew;
import java.util.Arrays;

class nQueensSolver {
    private int n;
    nQueensSolver(int size) { n = size; }
    int[][] solve() {
        System.out.format("%d Queens Solver\n\n", n);
        int[][] grid = new int[n][n];
        solve(grid, 0);
        System.out.println(output(grid));
        return grid;
    }
    private boolean solve(int[][] grid, int x) {
        if (x > n - 1) return true;         // let's bail, if we're done
        else for (int y = 0; y < n; y++) {  // try next row
            if (placeQueen(grid, x, y)) {   // place queen, if possible
                if (solve(grid, x + 1))
                    return true;
                grid[y][x] = 0;             // backtrack, it's not safe out there
            }
        }
        return false;
    }
    private boolean placeQueen(int[][] grid, int x, int y) {
        final int QUEEN = 1;

        for (int xi = 0; xi < n; xi++)                                  // horizontal check
            if (grid[y][xi] == QUEEN)  return false;
        for (int yi = 0; yi < n; yi++)                                  // vertical check
            if (grid[yi][x] == QUEEN)  return false;
        for (int rx = x + 1, yi = y - 1; rx < n && yi >= 0; rx++, yi--) // check upper right diagonals
            if (grid[yi][rx] == QUEEN) return false;
        for (int rx = x + 1, yi = y + 1; rx < n && yi < n; rx++, yi++)  // check lower right diagonals
            if (grid[yi][rx] == QUEEN) return false;
        for (int lx = x - 1, yi = y - 1; lx >= 0 && yi >= 0; lx--, yi--) // check upper left diagonals
            if (grid[yi][lx] == QUEEN) return false;
        for (int lx = x - 1, yi = y + 1; lx >= 0 && yi < n; lx--, yi++)  // check lower left diagonals
            if (grid[yi][lx] == QUEEN) return false;

        grid[y][x] = QUEEN;
        return true;
    }
    private String output(int[][] grid) {
        StringBuilder out = new StringBuilder();
        for (int[] row : grid) { out.append(Arrays.toString(row)); out.append('\n'); }
        return out.toString();
    }
}
