package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	    printYearsAndDays(525600);
	    printYearsAndDays(1051200);
	    printYearsAndDays(561600);
	    printYearsAndDays(-561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / (60 * 24);
            long remainingDays = days % 365;
            long years = (int) days / 365;

            System.out.println(String.format("%d min = %d y and %d d", minutes, years, remainingDays));
        }
    }
}
