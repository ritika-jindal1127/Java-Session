package com.Ritika693.Day45;

public class Findmax {



        public static int findMax(int[] arr) {
            int max = arr[0]; // assume first element is max
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }


        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 7};

            int maxValue = findMax(arr);

            System.out.println("Maximum element in array: " + maxValue);
        }
    }


