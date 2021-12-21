package com.moodyjun.adapter;

public class RectangleAdapter implements  TargetRectangle{
    @Override
    public int area(int x1, int x2, int y1, int y2) {
        Rectangle rectangle = new Rectangle();
        return rectangle.area(x1-x2, y2-y1);
    }
}
