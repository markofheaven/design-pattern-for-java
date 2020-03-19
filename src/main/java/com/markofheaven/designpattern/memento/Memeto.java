package com.markofheaven.designpattern.memento;

/**
 * Author: markofheaven
 * Date: 2020-03-19
 */
public class Memeto {
    private String state;

    public Memeto(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
