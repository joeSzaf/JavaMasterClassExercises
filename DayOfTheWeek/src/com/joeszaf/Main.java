package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(10);
    }

    public static void printDayOfTheWeek(int day) {
        String message;

        switch (day) {
            case 0:
                message = "Sunday";
                break;
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesdays";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            default:
                message = "Invalid day";
                break;
        }

        System.out.println(message);
    }
}
