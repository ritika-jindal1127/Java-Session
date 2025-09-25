package com.Ritika693.Day45;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int key=5;
        int index = linearSearch(arr,key);
        if(index==-1) {

                System.out.println("Element not found");

            }
        else{
            System.out.println("element "+ key +" found at index "+ index);

        }

        }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // return index if found
            }
        }
        return -1;
    }
}
