package com.markofheaven.designpattern.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.paint("长方形");
    }
}
