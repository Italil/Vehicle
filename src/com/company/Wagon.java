package com.company;

public class Wagon extends Vehicle {

    public Wagon(String name,double speed, double rts, double priceperkm) {
        super(name,speed, rts, priceperkm);
        rest = 1;
        restday = 10;
        capacity = 1500;
        passengerseats = 0;
    }
}
