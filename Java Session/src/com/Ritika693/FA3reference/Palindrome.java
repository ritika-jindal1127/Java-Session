package com.Ritika693.FA3reference;
//by recursiom
//public class Palindrome {
//    static int reverseNumber(int n, int rev){
//        if(n==0)
//            return rev;
//        return reverseNumber(n/10, rev*10+n%10);
//    }
//    static boolean isPalindrome(int n){
//        int reversed=reverseNumber(n, 0);
//        return n==reversed;
//    }
//    public static void main(String[]args){
//        int n=123321;
//        if(isPalindrome(n))
//            System.out.print("Yes");
//        else
//            System.out.print("No");
//    }
//}


public class Palindrome {
    public static void main(String[] args) {
        int n=123321;
        int temp=n;
        int reverse=0;
        while(temp>0)
        {
            int ld=temp%10;
            temp=temp/10;
            reverse=reverse*10+ld;
        }
        if(reverse==n)
        {
            System.out.print("Yes");
        }
        else
            System.out.print("No");
    }
}
