package com.Ritika693.Referenceques;

public class max_inArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
