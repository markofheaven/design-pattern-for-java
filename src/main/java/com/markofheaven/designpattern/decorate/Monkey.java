package com.markofheaven.designpattern.decorate;

/**
 * 齐天大圣的本体是一个猢狲，就是装饰模式中的具体实现类，需要被装饰的那个类
 */
public class Monkey implements GreatSageEquallingHeaven{
    @Override
    public void move() {
        System.out.println("Monkey move");
    }
}
