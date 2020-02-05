package com.markofheaven.designpattern.decorate;

/**
 * 齐天大圣有七十二变，就是装饰器中要进行的装饰行为。这里对应的是，一个叫齐天大圣的猢狲，要把自己装饰成其它的东西.
 */

public class Change implements GreatSageEquallingHeaven{
    private GreatSageEquallingHeaven greatSageEquallingHeaven;

    public Change(GreatSageEquallingHeaven greatSageEquallingHeaven){
        this.greatSageEquallingHeaven = greatSageEquallingHeaven;
    }
    @Override
    public void move() {
        greatSageEquallingHeaven.move();
    }
}
