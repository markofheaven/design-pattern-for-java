package com.markofheaven.designpattern.observer;

/**
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class ConcreteObserver implements Observer {
    @Override
    public void response1(String state) {
        System.out.println("Observer response one receive subject's notice: " + state);
    }

    @Override
    public void response2(String state) {
        System.out.println("Observer response two receive subject's notice: " + state);
    }
}
