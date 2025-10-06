package com.Ritika693.Referenceques;

public class Minmax {

        public static void main(String[] args) {
            int[] arr = {7, 2, 9, 4, 1};
            int min = arr[0], max = arr[0];

            for (int num : arr) {
                if (num < min) min = num;
                if (num > max) max = num;
            }

            System.out.println("Min = " + min + ", Max = " + max);
        }
    }


