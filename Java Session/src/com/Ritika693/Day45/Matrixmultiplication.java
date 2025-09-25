package com.Ritika693.Day45;
import java.util.Scanner;
public class Matrixmultiplication {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter rows amd col ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.print("enter rows and columns for sec  matrix: ");
        int n2=sc.nextInt();
        int p = sc.nextInt();

        if(n != n2)
        {
            System.out.println("matrix multiplication not possible ");
            return ;
        }

        int[][]A = new int[m][n];
        System.out.println("enter elements of first matrix; ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }

        int[][]B=new int[n][p];
        System.out.println("enter elements of sec matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<p;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }

        int[][]C =new int[m][p];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                for(int k=0;k<n;k++)
                {
                    C[i][j] += A[i][k]* B[k][j];
                }
            }
        }

        System.out.println("result matrix ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
