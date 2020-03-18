package com.markofheaven.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class ConcreteAggregate<E> implements Aggregate<E>{
    private List<E> list = new ArrayList<>();

    @Override
    public void add(E element) {
        list.add(element);
    }

    @Override
    public void remove(E element) {
        list.remove(element);
    }

    @Override
    public Iterator<E> getIterator() {
        return new ConcreteIterator<>(list);
    }


}
