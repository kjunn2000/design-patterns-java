package com.moodyjun.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "House Blend.";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
