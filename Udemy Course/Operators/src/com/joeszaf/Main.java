package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(result);

        previousResult = result;
        result = result * 10;
        System.out.println(result);

        previousResult = result;
        result = result / 5;
        System.out.println(result);

        previousResult = result;
        result = result % 3;
        System.out.println(result);

        previousResult = result;
        result ++;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100);
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;

        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        System.out.println("--------------");
        double var1 = 20;
        double var2 = 80;
        double result3 = (var1 + var2) * 25;
        double result4 = result3 % 40;
        if (result4 <= 20)
            System.out.println("Total was over the limit.");
    }
}
