package com.company;

public class Wagon extends Vehicle {

    public Wagon(String name,int speed, int rts, int priceperkm) {
        super(name,speed, rts, priceperkm);
        rest = 1;
        restday = 10;
        capacity = 1500;
        passengerseats = 0;
    }
}
