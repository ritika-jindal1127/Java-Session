package com.Ritika693.Referenceques;
import java.util.Scanner;
public class uppercasewithoutbuiltin {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String result = "";

            // Convert manually to uppercase
            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z')
                    result += (char) (ch - 32);  // ASCII conversion
                else
                    result += ch;
            }

            System.out.println("Uppercase: " + result);
            sc.close();
        }
    }


