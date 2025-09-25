package com.Ritika693.Day43;
import java.util.Arrays;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("enter catche size");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the data");
        String[] cache = new String[res];
        System.out.println("how many times you want to enter data");
        int ans = sc.nextInt();
        sc.nextLine();
        int pt = 0;
        for (int i = 0; i < ans; i++) {
            String data = sc.nextLine();

//            for(int j=res-1;j>0;j--){
//                cache[j] = cache[j-1];
//            }
//            cache[0] = data;

            cache[pt] = data;
            pt = (pt + 1) % res;

        }
        System.out.println(Arrays.toString(cache));
    }
}



