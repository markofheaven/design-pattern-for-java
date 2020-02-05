package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 * Author MarkOfHeaven
 * Date 2018/12/10
 */
public class DogFactory implements Factory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public AnimalFood createAnimalFood() {
        return new DogFood();
    }
}
