package com.Ritika693.Referenceques;

public class binarytriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }
}
