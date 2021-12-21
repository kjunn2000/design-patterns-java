package com.moodyjun.factory;

public class ShapeFactory {
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
}
