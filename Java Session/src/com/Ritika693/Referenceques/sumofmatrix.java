package com.Ritika693.Referenceques;

public class sumofmatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int sum = 0;
        for (int[] row : mat) {
            for (int x : row) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
