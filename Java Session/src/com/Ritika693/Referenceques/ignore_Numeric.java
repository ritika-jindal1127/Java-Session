package com.Ritika693.Referenceques;

import java.util.Scanner;

public class ignore_Numeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.print("Enter number of values: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            String input = scanner.nextLine();

            try {
                sum += Double.parseDouble(input);
            } catch (NumberFormatException e) {
                // Ignore non-numeric input
            }
        }

        System.out.println("Sum of numeric inputs: " + sum);
        scanner.close();
    }
}


//🧪 Sample Run:
//Enter number of values: 4
//Enter value 1: 10.5
//Enter value 2: hello
//Enter value 3: 3.2
//Enter value 4: 6
//
//Sum of numeric inputs: 19.7
//
//
//Let me know if you'd like to keep track of which inputs were ignored or add support for continuous input until a keyword like "done" is typed!
