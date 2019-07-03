package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        int minNum = 0;
        if (num1 <= num2) {
            minNum = num1;
        } else {
            minNum = num2;
        }

        int largestCommonDivisor = -1;

        for (int i = 1; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                largestCommonDivisor = i;
            }
        }

        return largestCommonDivisor;
    }
}
