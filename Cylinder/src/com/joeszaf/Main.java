package com.joeszaf;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);

        System.out.println(circle1.getRadius());;
        System.out.println(circle1.getArea());;

        Cylinder cyl1 = new Cylinder(5, 5);

        System.out.println(cyl1.getArea());
        System.out.println(cyl1.getVolume());

        System.out.println("----------");

        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
