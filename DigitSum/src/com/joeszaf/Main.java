package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(6));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int n = number;

        while (n > 0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }
}
