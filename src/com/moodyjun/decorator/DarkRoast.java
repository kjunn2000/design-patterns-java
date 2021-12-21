package com.moodyjun.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "Dark Roast.";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
