package com.Ritika693.Referenceques;
import java.util.Scanner;
public class linear_Search {
    public static int search(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target)
                    return i;
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            // Input array elements
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Input target value
            System.out.print("Enter target to search: ");
            int target = sc.nextInt();

            // Perform search and print result
            int result = search(arr, target);
            if (result != -1)
                System.out.println("Target found at index: " + result);
            else
                System.out.println("Target not found.");
        }
    }

