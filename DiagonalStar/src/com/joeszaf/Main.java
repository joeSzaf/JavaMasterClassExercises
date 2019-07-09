package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        printSquareStar(4);
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(100);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row ++) {
                String currentRow = "";
                for (int col = 1; col <= number; col ++) {
                    if (row == 1 || row == number || col == 1 || col == number) {
                        currentRow += "*";
                    } else if (row == col || number - row + 1 == col){
                        currentRow += "*";
                    } else {
                        currentRow += " ";
                    }

                }
                System.out.println(currentRow);
            }
        }

    }
}
