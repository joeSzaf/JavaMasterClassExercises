package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
        numberToWords(7);
        numberToWords(88);
    }

    public static int getDigitCount(int number) {
        if (number < 0){
            return -1;
        }

        int numberOfDigits = 1;

        while (number > 9) {
            number /= 10;
            numberOfDigits ++;
        }
        return numberOfDigits;
    }

    public static int reverse(int number){
        int negativeFactor = 1;

        if (number < 0) {
            negativeFactor = -1;
            number *= -1;
        }

        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber * negativeFactor;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);

            do {
                int currentDigit = reversedNumber % 10;

                switch (currentDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("invalid Number");
                        break;
                }

                reversedNumber /= 10;


            } while (reversedNumber > 0);

            for (int i = 0; i < getDigitCount(number) - getDigitCount(reverse(number)); i++) {
                System.out.println("Zero");
            }
        }

    }
}
