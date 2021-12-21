package com.moodyjun.decorator;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(new DarkRoast());
        ChocoChip chocoChip = new ChocoChip(milk);
        Milk doubleMilk = new Milk(chocoChip);
        System.out.println(doubleMilk.getCost());
    }
}
