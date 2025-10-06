package com.Ritika693.Referenceques;

public class number_pyrammd {
    public static void main(String[] args) {
        int n = 3;
// Upper
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            for (int j = 1; j < i; j++)
                System.out.print(i);
            System.out.println();
        }
// Lower
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            for (int j = 1; j < i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
