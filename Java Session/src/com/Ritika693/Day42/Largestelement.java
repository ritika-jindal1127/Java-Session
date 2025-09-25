package com.Ritika693.Day42;

public class Largestelement {
    public static void main(String[] args) {
        int [][]matrix={
                {1,2,3},
                {5,6,7},
                {4,5,6}
        };
        for(int i=0;i<matrix.length;i++)
        {
            int []row=matrix[i];
            int max=row[0];//means row first element means 1 will suppose to be largest then compare
            for(int j=0;j<row.length;j++)
            {
                if(row[j]>max){
                    max=row[j];
                }
            }
            System.out.println(max);
        }
    }
}
