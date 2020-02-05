package com.markofheaven.designpattern.state;

public interface State {
    void insertCoin();
    void returnCoin();
    void turnCrank();
    void dispense();
    void printState();
}
