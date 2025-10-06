package com.Ritika693.Referenceques;

public class checkborad {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % 2 == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
