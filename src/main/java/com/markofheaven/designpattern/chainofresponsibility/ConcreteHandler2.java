package com.markofheaven.designpattern.chainofresponsibility;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class ConcreteHandler2 implements Handler {
    private Handler next;

    @Override
    public void setNextHandle(Handler next) {
        this.next = next;
    }

    @Override
    public Handler getNextHandle() {
        return next;
    }

    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("Handler 2 handle the request.");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("No handler could handle the request.");
        }
    }
}
