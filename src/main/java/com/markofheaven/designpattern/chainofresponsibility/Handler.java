package com.markofheaven.designpattern.chainofresponsibility;

public interface Handler {
    void setNextHandle(Handler handler);

    Handler getNextHandle();

    void handleRequest(String request);
}
