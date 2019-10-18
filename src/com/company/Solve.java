package com.company;

public class Solve {

    double slvprice;
    double slvtime;

    public Solve(int range,Vehicle tc){

    slvtime = range/tc.speed;
    slvtime = slvtime + range/tc.rts*tc.rest;

    if(slvtime>20){
        slvtime+=tc.restday;
    }
    slvprice = range*tc.priceperkm;
    slvtime*=60;
    slvtime = Math.round(slvtime*100)/100;
    System.out.println("Примерное время поездки: " + slvtime + " мин.");
    System.out.println("Стоимость перевозки: " + slvprice);
    }
}
