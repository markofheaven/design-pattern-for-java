package com.markofheaven.designpattern.factory.factory;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/12/05
 */
public class CatFactory implements AnimalFactory{
    public Animal createAnimal() {
        return new Cat();
    }
}
