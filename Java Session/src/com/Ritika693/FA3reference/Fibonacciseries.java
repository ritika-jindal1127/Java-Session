package com.Ritika693.FA3reference;

public class Fibonacciseries {
    static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
