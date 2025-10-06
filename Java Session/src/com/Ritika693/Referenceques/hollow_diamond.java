package com.Ritika693.Referenceques;

public class hollow_diamond {
    public static void main(String[] args) {
        int n = 5;
// Upper
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
// Lower
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
