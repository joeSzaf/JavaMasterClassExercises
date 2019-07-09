package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0 ,4));
        System.out.println(canPack(1, 0 ,5));
        System.out.println(canPack(0, 5 ,4));
        System.out.println(canPack(2, 2 ,11));
        System.out.println(canPack(1, 0 ,4));
        System.out.println(canPack(-3, 2 ,12));
        System.out.println(canPack(3, 0,14));
        System.out.println(canPack(10, 1,21));
        System.out.println(canPack(5, 3,24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (5 * bigCount + smallCount < goal) {
            return false;
        } else {
            if (5 * bigCount > goal) {
                return goal % 5 <= smallCount;
            } else {
                return (5 * bigCount + smallCount) >= goal;
            }
        }
    }
}
