package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassOop car = new ClassOop();
        System.out.println("Write name of car : ");
        car.setName(sc.nextLine());
        System.out.println("Write of model car :");
        car.setModel(sc.nextLine());
        System.out.println("Write of color in car : ");
        car.setColour(sc.nextLine());
        System.out.println("Write year of car : ");
        car.setYear(sc.nextInt());
        System.out.println("Write of speed : ");
        car.setSpeed(sc.nextInt());
        System.out.println("Name : " + car.getName());
        System.out.println("Model : " + car.getModel());
        System.out.println("Color : " + car.getColour());
        System.out.println("Year : " + car.getYear());
        System.out.println("Speed : " + car.getSpeed());

    }
}
