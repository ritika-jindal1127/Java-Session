package com.Ritika693.Day43;
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter cache size: ");
            int size = sc.nextInt();


            int[] cache = new int[size];


            System.out.println("Enter " + size + " data elements:");
            for (int i = 0; i < size; i++) {
                cache[i] = sc.nextInt();
            }


            System.out.println("Cache elements in LIFO order:");
            for (int i = size - 1; i > 0; i--) {
                System.out.print(cache[i] + " ");
            }

            sc.close();
        }
    }
