package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 3;
	    float myFloatValue = 5f / 3f;
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // 1. Create a varaible to store the number of pounds
        int numOfPounds = 200;
        double numOfKilograms = numOfPounds * 0.45359237d;
        System.out.println(numOfPounds + "lbs in kg is " + numOfKilograms);
    }
}
