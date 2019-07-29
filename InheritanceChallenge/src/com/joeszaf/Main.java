package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	    ChevyBolt myBolt = new ChevyBolt(60);

	    myBolt.usePower(50);
	    myBolt.usePower(60);
	    myBolt.usePower(10);
	    myBolt.charge();
		myBolt.usePower(60);
		System.out.println("-----------");

		myBolt.accelerate(30);
		myBolt.steer(45);
		myBolt.accelerate(20);
		myBolt.accelerate(-42);


    }
}
