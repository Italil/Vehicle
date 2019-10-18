package com.company;

public class Car extends Vehicle {

    public Car(String name,double speed, double rts, double priceperkm) {
        super(name,speed, rts, priceperkm);
        rest = 0.5;
        restday = 7;
        capacity = 200;
        passengerseats = 4;
    }

}
