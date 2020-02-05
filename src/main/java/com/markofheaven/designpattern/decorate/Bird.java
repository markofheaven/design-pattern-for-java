package com.markofheaven.designpattern.decorate;

/**
 * 齐天大圣的另一种变化。另外一种装饰方法
 */
public class Bird extends Change{
    public Bird(GreatSageEquallingHeaven greatSageEquallingHeaven) {
        super(greatSageEquallingHeaven);
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Bird move");
    }
}
