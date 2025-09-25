package com.Ritika693.Day44;

public class BinarySerch {

        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 20};
            int key = 12;

            int low = 0, high = arr.length - 1;
            int mid, pos = -1;

            while (low <= high) {
                mid = (low + high) / 2;

                if (arr[mid] == key) {
                    pos = mid;
                    break;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (pos == -1)
                System.out.println("Element not found!");
            else
                System.out.println("Element found at index " + pos);
        }
    }


