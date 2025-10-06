package com.Ritika693.Referenceques;
import java.util.Arrays;
public class sort_Array_asc {
    public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 6};

            // Ascending
            Arrays.sort(arr);
            System.out.println("Ascending: " + Arrays.toString(arr));

            // Descending
        int[] desc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            desc[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Descending: " + Arrays.toString(desc));
        }
    }


