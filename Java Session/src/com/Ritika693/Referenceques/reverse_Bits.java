package com.Ritika693.Referenceques;

import java.util.Scanner;

public class reverse_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();  // Read user input

        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println(0);
        } else {
            System.out.println("Reversed number: " + rev);
        }

        sc.close();  // Close the scanner
    }
}
