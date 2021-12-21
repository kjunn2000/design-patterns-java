package com.moodyjun.abstractFactory;

public interface AbstractFactory {
    Shape getShape(String shape);
    Color getColor(String color);
}
