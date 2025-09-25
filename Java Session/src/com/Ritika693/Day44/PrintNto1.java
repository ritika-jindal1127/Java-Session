package com.Ritika693.Day44;
import java.util.Scanner;
public class PrintNto1 {

        public static void printNumbers(int n) {
            if (n == 0) {
                return; // base case
            }
            System.out.print(n + " "); // print kruga recent value
            printNumbers(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            System.out.println("Printing from " + n + " to 1:");
            printNumbers(n);

            sc.close();
        }
    }


