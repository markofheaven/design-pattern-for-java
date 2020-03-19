package com.markofheaven.designpattern.memento;

/**
 * Author: markofheaven
 * Date: 2020-03-19
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memeto createMemeto() {
        return new Memeto(state);
    }

    public void restore(Memeto memeto) {
        this.setState(memeto.getState());
    }
}
