package com.Ritika693.day38;

public class Whiledowhile4 {
    public static void main(String [] args){
        //while(Condition checked before entering)
        int i = 0;
        while (i < 5)
        {
            System.out.println("i = " + i );
            i++;
        }

        //do-while(Condition checked at the end)
        int j= 0;
        do {
            System.out.println("j = " + j );
            j++;
        } while (j < 5);

    }
}
