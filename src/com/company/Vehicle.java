package com.company;
// Создать суперкласс транспортные средства.
// В нем будут подклассы автомобиль, велосипед и повозка.
// Нужно посчитать время и стоимость перевозки пассажира на каждом транспортном средтве.
// Продолжение
// Создать новые переменные для вместимости груза и пассажиров(клиентов).
// Нужно расчитать сколько ед. транспорта будет необходимо для контретного "заказа" и что будет оптимальнее в определенной ситуации.
// Также необходимо учитывать, есть ли необходимое кол-во транспорта в парке.


abstract public class Vehicle {

    double speed;//скорость
    double rts;//расстояние до вынужденной остановки
    double priceperkm;//цена за км
    String name;
    double capacity;
    double passengerseats;
    double rest;
    double restday;

    public Vehicle(String name,double speed, double rts, double priceperkm) {
        this.name = name;
        this.speed = speed;
        this.rts = rts;
        this.priceperkm = priceperkm;
    }

    public void GetInfo(){
        System.out.println("Наименование: " + name);
        System.out.println("Ср. скорость: " + speed);
        System.out.println("Среднее расстояние до остановки: " + rts);
        System.out.println("Цена за КМ пути: "+ priceperkm);
    }
}
