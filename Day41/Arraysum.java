package com.Ritika693.Day41;

public class Arraysum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};  // Example array
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
