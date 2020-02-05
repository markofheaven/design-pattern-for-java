package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 * Author MarkOfHeaven
 * Date 2018/12/10
 */
public class DogFood implements AnimalFood {
    private static final String FOOD_NAME = "Dog food~";
    @Override
    public void printFoodName() {
        System.out.println(FOOD_NAME);
    }
}
