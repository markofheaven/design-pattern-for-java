package com.markofheaven.designpattern.mediator;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class ConcreteColleague2 implements Colleague{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("Concrete colleague2 receive message. Message: " + message);
    }

    @Override
    public void send() {
        mediator.relay(this);
    }

    @Override
    public String getMessage() {
        return "This message is from concrete colleague2.";
    }
}
