package com.joeszaf;

public class ChevyBolt extends Car {
    private int batteryCharge;
    private int roadServiceMonths;

    public ChevyBolt(int roadServiceMonths) {
        super("Bolt", 4, 4, false, 5);
        this.batteryCharge = 100;
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeVelocity(newSpeed, getCurrentDirection());
        }
    }

    public void usePower(int powerUse) {
        if (this.batteryCharge - powerUse < 0){
            System.out.println("Cant use that much power.");
        } else {
            this.batteryCharge -= powerUse;
            System.out.println(this.batteryCharge + " power remaininging.");
        }
    }

    public void charge(){
        if (this.batteryCharge < 100){
            this.batteryCharge = 100;
            System.out.println("Car has been charged!");
        } else {
            System.out.println("Already at full charge");
        }
    }
}
