package com.company;

public class Bicycle extends Vehicle {

    public Bicycle(String name,double speed, double rts, double priceperkm) {
        super(name,speed, rts, priceperkm);
        rest = 0.3;
        restday = 8;
        capacity = 0;
        passengerseats = 1;
    }

}
