package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 * 抽象工厂模式的工厂接口，这里只描述要创建的产品抽象，在这里就是某一种动物和该动物要吃的食物。
 */
public interface Factory {
    Animal createAnimal();
    AnimalFood createAnimalFood();
}
