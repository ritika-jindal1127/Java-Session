package com.Ritika693.Day41;

public class Remove {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 20, 40, 20, 50};
            int valueToRemove = 20;
            int count = 0;


            for (int num : arr) {
                if (num != valueToRemove) {
                    count++;
                }
            }


            int[] newArr = new int[count];
            int index = 0;


            for (int num : arr) {
                if (num != valueToRemove) {
                    newArr[index++] = num;
                }
            }


            System.out.println("Array after removing " + valueToRemove + ":");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }


