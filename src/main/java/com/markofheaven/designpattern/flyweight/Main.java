package com.markofheaven.designpattern.flyweight;

/**
 * 原文链接http://c.biancheng.net/view/1371.html
 */
public class Main {
    public static void main(String[] args) {
        FlyWeight flyWeightA1 = FlyWeightFactory.getFlyWeight("a");
        FlyWeight flyWeightA2 = FlyWeightFactory.getFlyWeight("a");
        System.out.println("A1 hash code: " + flyWeightA1.hashCode());
        System.out.println("A2 hash code: " + flyWeightA2.hashCode());

        UnsharedConcreteFlyweight unshared = new UnsharedConcreteFlyweight("非共享信息");
        flyWeightA1.operation(unshared);
    }
}
