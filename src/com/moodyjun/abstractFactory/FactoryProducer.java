package com.moodyjun.abstractFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        switch (type){
            case "shape": {
                return new ShapeFactory();
            }
            case "color": {
                return new ColorFactory();
            }
        }
        return null;
    }
}
