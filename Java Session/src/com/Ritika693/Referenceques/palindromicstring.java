package com.Ritika693.Referenceques;
import java.util.Scanner;
public class palindromicstring {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String rev = "";

            // Reverse the string
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }


            //Check palindrome
            if (str.equals(rev))
                System.out.println(rev);
            else
                System.out.println(str + " is Not a Palindrome");


        }
    }


