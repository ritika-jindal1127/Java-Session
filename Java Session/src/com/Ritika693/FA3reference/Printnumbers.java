package com.Ritika693.FA3reference;
import java.util.Scanner;
public class Printnumbers {
    static void printNumbers(int n)
    {
        if(n==0)
            return;
        printNumbers(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printNumbers(n);
    }
}
