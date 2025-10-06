package com.Ritika693.Day47;

public class quick_Sort {

        public static int partition(int [] arr, int low, int high)
        {
            int pivot=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++)
            {
                if(arr[j]<pivot)
                {
                    i++;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            i++;
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;
        }
        public static void quickSort(int [] arr, int low, int high)
        {
            if(low<high)
            {
                int pindx=partition(arr,low,high);
                quickSort(arr, low, pindx-1);
                quickSort(arr, pindx+1,high);
            }
        }
        public static void main(String[] args)
        {
            int [] arr={6,2,5,10,8,9};
            int n=arr.length;
            quickSort(arr,0,n-1);

            System.out.println("Updated Array: ");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

