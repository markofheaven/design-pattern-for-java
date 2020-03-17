package com.markofheaven.designpattern.observer;

/**
 * 被观测的目标，即单个对象方的抽象。单个对象发生变化时，要调用持有的多个对象的对应方法
 * Author: markofheaven
 * Date: 2020-03-17
 */
public interface Subject {
    // 增删观察者，只有被持有的观察者才会被通知
    void add(Observer observer);

    void remove(Observer observer);

    // 通知观察者
    void notifyObserver1();

    void notifyObserver2();
}
