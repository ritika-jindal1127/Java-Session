package com.Ritika693.Referenceques;

public class count_Words_string {

        public static void main(String[] args) {
            String str = "Hello world this is Java";
            String[] words = str.trim().split("\\s+");
            System.out.println("Word Count: " + words.length);
        }
    }


