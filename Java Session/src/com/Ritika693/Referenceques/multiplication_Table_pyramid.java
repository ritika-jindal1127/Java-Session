package com.Ritika693.Referenceques;

public class multiplication_Table_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.printf("%2d ", i * j);
            for (int j = i - 1; j >= 1; j--) System.out.printf("%2d ", i * j);
            System.out.println();
        }
    }
}
