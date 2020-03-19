package com.markofheaven.designpattern.memento;

/**
 * Author: markofheaven
 * Date: 2020-03-19
 */
public class Caretaker {
    private Memeto memeto;

    public Memeto getMemeto() {
        return memeto;
    }

    public void setMemeto(Memeto memeto) {
        this.memeto = memeto;
    }
}
