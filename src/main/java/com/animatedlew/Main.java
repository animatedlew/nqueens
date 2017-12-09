package com.animatedlew;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter grid size: " );
        nQueensSolver board = new nQueensSolver(input.nextInt());
        board.solve();
    }
}
