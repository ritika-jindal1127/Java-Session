package com.Ritika693.day37;

public class Operators {
    public static void main(String [] args){

        int a=10;
        //Assignment
        a+=1;
        a-=2;
        a*=3;
        a/=4;
        a%=5;
        System.out.println(a);

        int b=5;
        //Relational
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        //Logical
        boolean p=true, q=false;
        System.out.println(p && q);
        System.out.println(p || q);
        System.out.println(!p);

        //Ternary
        String result=(a==1)? "Yes" : "No";
        System.out.println(result);

    }
}
