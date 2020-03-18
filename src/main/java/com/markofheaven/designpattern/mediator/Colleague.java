package com.markofheaven.designpattern.mediator;

/**
 * 同事类的接口，即需要互相通信的对象的接口
 * Author: markofheaven
 * Date: 2020-03-18
 */
public interface Colleague {
    void setMediator(Mediator mediator);
    void receive(String message);
    void send();
    String getMessage();
}
