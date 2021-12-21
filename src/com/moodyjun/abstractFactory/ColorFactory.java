package com.moodyjun.abstractFactory;

public class ColorFactory implements AbstractFactory{
    public Shape getShape(String shape){
        return null;
    }

    @Override
    public Color getColor(String color) {
        switch(color) {
            case "red": {
                return new Red();
            }
            case "yellow": {
                return new Yellow();
            }
        }
        return null;
    }
}
