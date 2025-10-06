package com.Ritika693.Day47;
import java.util.Scanner;
public class merge_Sort {
    // Merge two halves
        public static void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            int[] left = new int[n1];
            int[] right = new int[n2];

            for (int i = 0; i < n1; i++)
                left[i] = arr[l + i];
            for (int j = 0; j < n2; j++)
                right[j] = arr[m + 1 + j];

            int i = 0, j = 0, k = l;

            while (i < n1 && j < n2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = left[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        // Recursive merge sort
        public static void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            mergeSort(arr, 0, n - 1);

            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }





