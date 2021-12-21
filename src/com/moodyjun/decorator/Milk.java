package com.moodyjun.decorator;

public class Milk extends BeverageDecorator{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 10 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "-Milk";
    }
}
