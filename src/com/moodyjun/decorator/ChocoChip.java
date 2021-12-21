package com.moodyjun.decorator;

public class ChocoChip extends BeverageDecorator{
    private Beverage beverage;

    public ChocoChip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 15 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "-Chips";
    }
}
