package com.Ritika693.Referenceques;

public class spiral_Pattern {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[n][n];
        int num = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) mat[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) mat[i][right] = num++;
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) mat[bottom][i] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) mat[i][left] = num++;
                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
