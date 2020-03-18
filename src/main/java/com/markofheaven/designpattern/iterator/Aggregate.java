package com.markofheaven.designpattern.iterator;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public interface Aggregate<E> {
    void add(E element);
    void remove(E element);
    Iterator<E> getIterator();
}
