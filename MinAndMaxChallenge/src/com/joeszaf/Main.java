package com.joeszaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int minNumber = 0;
        int minNumber = Integer.MAX_VALUE;

//        int maxNumber = 0;
        int maxNumber = Integer.MIN_VALUE;

//        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();

            if(!hasNextInt) {
                break;
            }

            int enteredNumber = scanner.nextInt();
            scanner.nextLine();
//
//            if (first) {
//                minNumber = enteredNumber;
//                maxNumber = enteredNumber;
//                first = false;
//            } else {
//                if (enteredNumber < minNumber) {
//                    minNumber = enteredNumber;
//                }
//
//                if (enteredNumber > maxNumber) {
//                    maxNumber = enteredNumber;
//                }
//            }

            if (enteredNumber < minNumber) {
                minNumber = enteredNumber;
            }

            if (enteredNumber > maxNumber) {
                maxNumber = enteredNumber;
            }
        }

        System.out.println("The minimum number is " + minNumber);
        System.out.println("The maximum number is " + maxNumber);

        scanner.close();
    }
}
