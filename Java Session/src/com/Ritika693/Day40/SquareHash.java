package com.Ritika693.Day40;

public class SquareHash {

        public static void main(String[] args) {
            int n = 3; // size of the square

            for (int i = 0; i < n; i++) {         // loop for rows
                for (int j = 0; j < n; j++) {     // loop for columns
                    System.out.print("#");
                }
                System.out.println(); // move to the next line after each row
            }
        }
    }


