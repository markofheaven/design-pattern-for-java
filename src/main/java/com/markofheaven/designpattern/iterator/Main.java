package com.markofheaven.designpattern.iterator;

/**
 * 实际上jdk中的集合就使用了迭代器，这里简单的实现一下。某些方法并不严谨，只是做一个示例。
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class Main {
    public static void main(String[] args) {
        Aggregate<Cat> aggregate = new ConcreteAggregate<>();
        aggregate.add(new Cat("Tom"));
        aggregate.add(new Cat("Pony"));

        Iterator<Cat> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            System.out.println(cat.getName());
        }
    }
}
