package com.Ritika693.day38;
import java.util.Scanner;
public class PrintRemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks(0-100): ");
        int marks = sc.nextInt();

        // Using if-else
        System.out.println("Using if-else:");
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 50) {
            System.out.println("Good");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println();

        // Using switch
        System.out.println("Using switch:");
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
            case 7:
                System.out.println("Very Good");
            case 6:
            case 5:
                System.out.println("Good");
                break;
            case 4:
            case 3:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
