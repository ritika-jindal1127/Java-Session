package com.Ritika693.Referenceques;

public class trim_Split {

        public static void main(String[] args) {
            String str = "   Hello   World Java   ";
            System.out.println("After trim: '" + str.trim() + "'");

            String[] words = str.trim().split("\\s+");
            for (String w : words) {
                System.out.println(w);
            }
        }
    }


