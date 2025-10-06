package com.Ritika693.Referenceques;

public class heart_Pattern {
    public static void main(String[] args) {
// Top curves
        System.out.println(" * * ");
        System.out.println("* *");
        System.out.println("* *");
// Bottom triangle
        for (int i = 7; i >= 1; i -= 2) {
            for (int j = 0; j < (7 - i) / 2; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
