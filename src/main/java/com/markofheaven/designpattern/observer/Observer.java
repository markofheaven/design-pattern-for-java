package com.markofheaven.designpattern.observer;

/**
 * 观察者，即多个对象方的抽象。会被单个对象方持有
 * Author: markofheaven
 * Date: 2020-03-17
 */
public interface Observer {

    // 被观察者调用这个方法，来通知观察者，它发生变化了
    void response1(String state);

    void response2(String state);
}
