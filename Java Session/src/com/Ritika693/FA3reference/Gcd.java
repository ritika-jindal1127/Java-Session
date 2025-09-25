package com.Ritika693.FA3reference;

public class Gcd {
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int num1=48, num2=18;
        System.out.print(gcd(num1,num2));
    }
}
