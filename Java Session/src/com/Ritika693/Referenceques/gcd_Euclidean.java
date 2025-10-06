package com.Ritika693.Referenceques;
import java.util.Scanner;
public class gcd_Euclidean {
    public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create Scanner object

            System.out.print("Enter first number: ");
            int a = sc.nextInt();  // Read first integer

            System.out.print("Enter second number: ");
            int b = sc.nextInt();  // Read second integer

            int result = gcd(a, b);  // Compute GCD
            System.out.println("GCD of " + a + " and " + b + " is: " + result);

            sc.close();  // Close the scanner
        }
    }




