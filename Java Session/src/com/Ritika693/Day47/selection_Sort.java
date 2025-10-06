package com.Ritika693.Day47;
import java.util.Scanner;
public class selection_Sort {
     static void selectionsort(int [] arr,int n)
        {
            for(int i=0;i<n-1;i++)
            {
                int minindex=i;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]<arr[minindex])
                    {
                        minindex=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            selectionsort(arr,n);
            System.out.println("Updaated Array: ");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }





