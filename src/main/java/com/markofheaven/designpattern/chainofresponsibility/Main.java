package com.markofheaven.designpattern.chainofresponsibility;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNextHandle(handler2);

        String request1 = "one";
        String request2 = "two";
        String request3 = "three";

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
