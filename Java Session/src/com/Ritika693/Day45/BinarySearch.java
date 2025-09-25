package com.Ritika693.Day45;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 10, 12};
        int start = 0, end = arr.length - 1;
        int target = 12;
        int result = -1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            System.out.println(result);

    }
}
