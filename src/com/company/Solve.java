package com.company;

public class Solve {

    int slvprice;
    double slvtime;

    public Solve(int range,Vehicle tc){

    slvtime = range/tc.speed;
    slvtime = slvtime + range/tc.rts*tc.rest;

    if(slvtime>20){
        slvtime+=tc.restday;
    }

    slvprice = range*tc.priceperkm;

    System.out.println("Время поездки: " + slvtime);
    System.out.println("Стоимость перевозки: " + slvprice);
    }
}
