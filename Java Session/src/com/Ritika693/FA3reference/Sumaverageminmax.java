package com.Ritika693.FA3reference;
import java.util.Scanner;
public class Sumaverageminmax {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        System.out.println("Sum: "+sum);

        float average=(float)sum/n;
        System.out.println("Average: "+ average);

        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);

        sc.close();
    }
}
