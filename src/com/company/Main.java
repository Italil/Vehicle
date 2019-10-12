package com.company;
// Создать суперкласс транспортные средства.
// В нем будут подклассы автомобиль, велосипед и повозка.
// Нужно посчитать время и стоимость перевозки пассажира на каждом транспортном средтве.
// Продолжение
// Создать новые переменные для вместимости груза и пассажиров(клиентов).
// Нужно расчитать сколько ед. транспорта будет необходимо для контретного "заказа" и что будет оптимальнее в определенной ситуации.
// Также необходимо учитывать, есть ли необходимое кол-во транспорта в парке.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vriant;
        int scrange;

        Vehicle[] TC = new Vehicle[3];
        TC[0] = new Car("Такси 1",70,450,20);
        TC[1] = new Bicycle("Велосипед 1",14,20,10);
        TC[2] = new Wagon("Грузовик 1",30,150,30);

        System.out.println("Что вы хотите? \n 1 - Прокатиться на такси. \n 2 - Арендовать велосипед. \n 3 - Перевезти груз.");
        vriant = sc.nextInt();

        System.out.println("Какое расстояние, примерно, вам необходимо преодолеть?");
        scrange = sc.nextInt();

        switch (vriant)
        {
            case 1 :
                Solve sl = new Solve(scrange,TC[0]);
                TC[0].GetInfo();
                break;
            case 2 :
                Solve sl2 = new Solve(scrange,TC[1]);
                break;
            case 3 :
                Solve sl3 = new Solve(scrange,TC[2]);
                break;
            default:
                System.out.println("Вы сами не знаете чего хотите!");
        }

        sc.close();
    }
}