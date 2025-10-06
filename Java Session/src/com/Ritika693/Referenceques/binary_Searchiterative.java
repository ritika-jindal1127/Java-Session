package com.Ritika693.Referenceques;
import java.util.Scanner;
import java.util.Arrays;


public class binary_Searchiterative {

        public static int search(int[] arr, int target) {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] < target) low = mid + 1;
                else high = mid - 1;
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
            System.out.println("Enter " + size + " sorted elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Optional: sort the array if user enters unsorted values
            Arrays.sort(arr);

            // Input target value
            System.out.print("Enter target to search: ");
            int target = sc.nextInt();

            // Perform binary search
            int result = search(arr, target);
            if (result != -1)
                System.out.println("Target found at index: " + result);
            else
                System.out.println("Target not found.");
        }
    }

