package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 * Author MarkOfHeaven
 * Date 2018/12/10
 */
public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public AnimalFood createAnimalFood() {
        return new CatFood();
    }
}
