package com.markofheaven.designpattern.factory.factory;

/**
 * 工厂模式的工厂接口，表示想要创建一个Animal。但是具体创建哪一个Animal则是由实现这个接口的类决定。当客户端使用的时候，需要自行添加
 * 判断逻辑，判断实例化哪个实现类来创建具体的Animal。
 */
public interface AnimalFactory {
    Animal createAnimal();
}
