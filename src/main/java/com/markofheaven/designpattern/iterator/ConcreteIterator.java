package com.markofheaven.designpattern.iterator;

import java.util.List;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class ConcreteIterator<E> implements Iterator<E>{
    private List<E> list;
    private int index = -1;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }
    @Override
    public E first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public E next() {
        if (hasNext()) {
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return (index < (list.size() - 1));
    }
}
