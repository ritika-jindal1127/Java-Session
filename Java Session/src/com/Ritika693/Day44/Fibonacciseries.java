package com.Ritika693.Day44;

public class Fibonacciseries {

        public static int fib(int n) {

            if (n <= 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }

        public static void main(String[] args) {
            int terms = 10;  // terms jinia chindia ne

            System.out.println("Fibonacci Series up to " + terms + " terms:");
            for (int i = 0; i < terms; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }



