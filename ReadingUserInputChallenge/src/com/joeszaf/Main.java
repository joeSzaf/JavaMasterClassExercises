package com.joeszaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int counter = 1;
	    int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the challenge!");

	    while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                counter ++;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }

        scanner.close();

        System.out.println("The total sum is: " + sum);
    }
}
