package com.markofheaven.designpattern.iterator;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public interface Iterator<E> {
    E first();
    E next();
    boolean hasNext();
}
