package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        if (number < 0) {
            originalNumber *= -1;
            number *= -1;
        }

        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;

            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
