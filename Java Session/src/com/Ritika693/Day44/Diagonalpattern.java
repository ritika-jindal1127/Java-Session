package com.Ritika693.Day44;
import java.util.Scanner;
public class Diagonalpattern {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.print("Enter elements of matrix: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int diagnol=1;
            for(int i=0;i<cols;i++)
            {

                for(int j=0;j<rows;j++)
                {
                    if(i==j)
                    {
                        diagnol=diagnol* matrix[i][j];
                    }
                }
            }
            System.out.println(diagnol);



            //print krn lyi
            for(int i=0;i<cols;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    if(i==j)
                    {System.out.print(diagnol+" ");}
                    else{
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println();
        }
        }
    }


