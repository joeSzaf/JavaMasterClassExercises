package com.joeszaf;

public class Main {

    public static void main(String[] args) {

        // Integer has a width of 32
	    int myMinVale = -2_147_483_648;
        int myMaxVale = 2_147_483_647;
        int myTotal = myMinVale/2;
        System.out.println("My total = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("My new byte value = " + myNewByteValue);

        // Short has a width of 16
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue /2);
        System.out.println();

        // Long has a width of 64
        long myLongValue = 100L;

        // 1
        byte var1 = 11;
        // 2
        short var2 = 5899;
        // 3
        int var3 = 99_098_121;
        // 4
        long var4 = 50000L + (10L * (var1 + var2 + var3));
        System.out.println("The answer to the challenge is: " + var4);
    }
}
