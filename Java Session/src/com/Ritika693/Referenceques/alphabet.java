package com.Ritika693.Referenceques;

public class alphabet {
//    public static void main(String[] args) {
//        for (char  i= 'A'; i <= 'E'; i++) {
//            System.out.println(i);
//        }
//    }
public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print((char)('A' + j - 1));
        }
        System.out.println();
    }
}
}
