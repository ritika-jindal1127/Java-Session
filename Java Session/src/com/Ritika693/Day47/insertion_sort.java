package com.Ritika693.Day47;
import java.util.Scanner;
public class insertion_sort {



        static void insertionSort(int n, int[] arr){
            for(int i=1;i<n;i++)
            {
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=key;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n= sc.nextInt();
            int[]arr=new int[n];
            System.out.print("Enter elements of array: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            insertionSort(n, arr);

            System.out.print("Sorted array: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }

        }
    }

