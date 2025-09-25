package com.Ritika693.FA3reference;

public class Sumargs {

//3 dot te click krke pass with arguements te click krge or values dvage then oh sum krke dyu
        public static void main(String[] args) {
            int sum = 0;
            for (String arg : args) {
                try {
                    sum += Integer.parseInt(arg);
                } catch (NumberFormatException e) {

                }
            }
            System.out.println("Total Sum = " + sum);
        }
    }




