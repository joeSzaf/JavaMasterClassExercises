package com.joeszaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if(!hasNextInt) {
                break;
            }

            sum += scanner.nextInt();
            counter ++;
            scanner.nextLine();
        }

        long average = 0;

        if (counter != 0) {
            average = Math.round( sum / (double) counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
