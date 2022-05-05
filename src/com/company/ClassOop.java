package com.company;

public class ClassOop {
    private String name;
    private String model;
    private String colour;
    private int year;
    private int speed;

    void setName(String carName) {
        name = carName;
    }

    void setModel(String carmodel) {
        model = carmodel;
    }

    void setColour(String carcolour) {
        colour = carcolour;
    }

    void setYear(int caryear) {
        year = caryear;
    }

    void setSpeed(int carspeed) {
        speed = carspeed;
    }

    String getName() {
        return name;
    }

    String getModel() {
        return model;
    }

    String getColour() {
        return colour;
    }

    int getYear() {
        return year;
    }

    int getSpeed() {
        return speed;
    }

    void checkSpeed(int a) {
        if (a >= 110) {
            System.out.println("To fast ");
        } else if (a <= 30 && a > 20) {
            System.out.println("To slow");
        }
        else if (a>30){
            System.out.println("Speed is Normall");
        }else {
            System.out.println("You Turtle");
        }
    }

}
