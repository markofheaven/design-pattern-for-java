package com.markofheaven.designpattern.observer;

/**
 * 观察者模式，又称为订阅发布模式。对象间存在一对多的依赖关系。当一个对象状态发生改变时，所有依赖它的对象都会得到通知从而被
 * 自动更新。
 * 不要被其中的得到通知，自动更新误导。本质上是多个对象作为集合被单个对象拥有。当单个对象状态变化时，会调用单个对象的某个方法A。
 * 在方法A中，会调用多个对象的某个方法B。方法B可以有参数，从而说多个对象可以得到通知；方法B会做某些事情，从而说多个对象会被自动更新。
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.add(observer);
        subject.notifyObserver1();
        subject.notifyObserver2();
    }
}
