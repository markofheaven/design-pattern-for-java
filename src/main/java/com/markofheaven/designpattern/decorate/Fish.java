package com.markofheaven.designpattern.decorate;

/**
 * 齐天大圣能变鱼。就是某一种装饰方法
 */
public class Fish extends Change{

    public Fish(GreatSageEquallingHeaven greatSageEquallingHeaven) {
        super(greatSageEquallingHeaven);
    }

    @Override
    public void move(){
        System.out.println("Fish move");
        super.move();
    }
}
