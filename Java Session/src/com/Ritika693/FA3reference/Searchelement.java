package com.Ritika693.FA3reference;
import java.util.Scanner;
public class Searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target=sc.nextInt();

        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.print("The number "+target+" is found on "+ i);
                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("-1");
        }
    }
}
