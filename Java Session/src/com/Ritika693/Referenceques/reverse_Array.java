package com.Ritika693.Referenceques;

public class reverse_Array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int x : arr)
            System.out.print(x + " ");
    }
}
