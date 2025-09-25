package com.Ritika693.Day45;

public class Sumallelements {
    public static int sumarray(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5};
        int result=sumarray(arr);

        System.out.println("sum of all elemnts "+result);
    }

}
