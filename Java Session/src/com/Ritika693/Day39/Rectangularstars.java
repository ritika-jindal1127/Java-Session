package com.Ritika693.Day39;
import java.util.Scanner;
public class Rectangularstars {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
