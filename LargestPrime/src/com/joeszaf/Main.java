package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(13));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        // check if number is a prime number
        int counter = 0;

        for (int i = number/2; i > 0; i--) {
            if (number % i == 0) {
                counter ++;
            }
        }

        // if the counter is only 1, then the number is prime, return it
        if (counter == 1) {
            return number;
        }


        // check all divisors if number is not prime, start at number/2

        for (int i = number/2; i > 1; i --) {
            if (number % i == 0 && getLargestPrime(i) == i) {
                return i;
            }
        }

        return -1;

    }
}
