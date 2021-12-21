package com.moodyjun.abstractFactory;

public class ShapeFactory implements AbstractFactory{
    public Shape getShape(String shape){
        switch(shape) {
            case "circle": {
                return new Circle();
            }
            case "square": {
                return new Square();
            }
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
