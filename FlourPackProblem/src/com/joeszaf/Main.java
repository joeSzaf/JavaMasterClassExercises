package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCount * 5 + smallCount < goal) {
            return false;
        }

        


    }
}
