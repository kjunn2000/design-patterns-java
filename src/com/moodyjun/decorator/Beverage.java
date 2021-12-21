package com.moodyjun.decorator;

public abstract class Beverage {
    protected String description;

    public abstract int getCost();
    public String getDescription(){
        return this.description;
    };

}