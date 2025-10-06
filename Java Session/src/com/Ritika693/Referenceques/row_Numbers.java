package com.Ritika693.Referenceques;

public class row_Numbers {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    int rows = 4, cols = 5;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {
            if (i == 1 || i == rows || j == 1 || j == cols)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
