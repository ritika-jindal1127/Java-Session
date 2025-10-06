package com.Ritika693.Referenceques;

public class copy_Elementsonetoother {
    public static void main(String[] args) {
        int[] src = {1, 2, 3};
        int[] result = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            result[i] = src[i];
        }
        for (int x : result)
            System.out.print(x + " ");
    }
}
