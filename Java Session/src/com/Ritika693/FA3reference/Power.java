package com.Ritika693.FA3reference;

public class Power {
    static int power(int x, int n)
    {
        if(n==0)
            return 1;
        return x*power(x, n-1);
    }

    public static void main(String[] args) {
        int x=5,n=2;
        System.out.print(power(x,n));
    }
}
