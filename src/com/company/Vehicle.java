package com.company;
// Создать суперкласс транспортные средства.
// В нем будут подклассы автомобиль, велосипед и повозка.
// Нужно посчитать время и стоимость перевозки пассажира на каждом транспортном средтве.
// Продолжение
// Создать новые переменные для вместимости груза и пассажиров(клиентов).
// Нужно расчитать сколько ед. транспорта будет необходимо для контретного "заказа" и что будет оптимальнее в определенной ситуации.
// Также необходимо учитывать, есть ли необходимое кол-во транспорта в парке.


abstract public class Vehicle {

    int spd;//скорость
    int rts;//расстояние до вынужденной остановки
    int priceperkm;//цена за км
    double rest;
    double restday;

    public Vehicle(int spd, int rts, int priceperkm) {
        this.spd = spd;
        this.rts = rts;
        this.priceperkm = priceperkm;

    }

    public void GetInfo(){
        System.out.println("Скорость: " + spd);
        System.out.println("Среднее расстояние до остановки: " + rts);
        System.out.println("Цена за КМ пути: "+ priceperkm);
    }
}
