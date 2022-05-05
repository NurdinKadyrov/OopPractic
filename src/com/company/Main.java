package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        ClassOop car = new ClassOop();
        car.setName("Camry");
        car.setModel("Camry 70");
        car.setColour("White");
        car.setYear(2022);
        car.setSpeed(seed);
        System.out.println("Name : " + car.getName());
        System.out.println("Model : " + car.getModel());
        System.out.println("Color : " + car.getColour());
        System.out.println("Year : " + car.getYear());
        System.out.println("Speed : " + car.getSpeed());
        car.checkSpeed(seed);
    }
}
