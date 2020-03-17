package com.markofheaven.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观测者的具体实现
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver1() {
        observers.forEach(observer -> observer.response1("Subject is in state one now."));
    }

    @Override
    public void notifyObserver2() {
        observers.forEach(observer -> observer.response2("Subject is in state two now."));
    }
}
