package com.Ritika693.Day41;

public class Arrayinsert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int value = 99;
        int index = 2;

        int[] newArr = new int[arr.length + 1];


        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }


        newArr[index] = value;


        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }


        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
