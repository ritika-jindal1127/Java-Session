package com.Ritika693.Day39;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter numbers of rows: ");
       int N = sc.nextInt();

       for(int i=1;i<=N;i++)
       {
           for(int j=1;j<=N;j++){
               if(j<=N-i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("* ");
               }
           }
           System.out.println();
       }
    }
}
