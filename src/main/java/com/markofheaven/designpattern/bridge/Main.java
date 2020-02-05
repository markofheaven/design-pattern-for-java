package com.markofheaven.designpattern.bridge;

/**
 * https://www.runoob.com/w3cnote/bridge-pattern2.html
 */
public class Main {
    public static void main(String[] args) {
        Color white = new White();
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

        Color gray = new Gray();
        Shape circle = new Circle();
        circle.setColor(gray);
        circle.draw();
    }
}
