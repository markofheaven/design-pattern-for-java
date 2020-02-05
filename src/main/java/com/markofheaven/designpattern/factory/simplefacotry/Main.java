package com.markofheaven.designpattern.factory.simplefacotry;

/**
 * 简单工厂模式又叫静态工厂方法，在工厂内部已经包含了判断逻辑，由传入的参数决定创建哪一个产品类。这样简化了客户端的逻辑，
 * 实现也很容易，但是缺点是违背了开放-封闭原则。当新增加产品类时，要修改工厂类中的case语句。
 * Author MarkOfHeaven
 * Date 2018/12/04
 */
public class Main {
    public static void main(String[] args){
        Animal cat = SimpleFactory.createAnimal(SimpleFactory.CAT_NAME);
        cat.bark();

        Animal dog = SimpleFactory.createAnimal(SimpleFactory.DOG_NAME);
        dog.bark();
    }
}
