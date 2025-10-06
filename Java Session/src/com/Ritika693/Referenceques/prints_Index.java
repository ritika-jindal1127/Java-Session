package com.Ritika693.Referenceques;

import java.util.Scanner;

public class prints_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many inputs the user wants to enter
        System.out.print("Enter number of inputs: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        // Create an array to store the inputs
        String[] inputs = new String[count];

        // Collect inputs from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
        }

        // Print each input with its index
        System.out.println("\nIndexed Output:");
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(i + ": " + inputs[i]);
        }
    }
}
