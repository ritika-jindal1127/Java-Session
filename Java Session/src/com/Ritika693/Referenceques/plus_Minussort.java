package com.Ritika693.Referenceques;
import java.util.Arrays;
public class plus_Minussort {


        public static void main(String[] args) {
            int[] arr = {5, 1, 9, 3, 7, 2};
            Arrays.sort(arr);
            int[] result = new int[arr.length];

            int left = 0, right = arr.length - 1;
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (flag) result[i] = arr[right--];
                else result[i] = arr[left++];
                flag = !flag;
            }

            System.out.println("Alternate (+ -) sort: " + Arrays.toString(result));
        }
    }


