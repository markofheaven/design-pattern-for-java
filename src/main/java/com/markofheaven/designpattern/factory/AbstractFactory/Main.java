package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 * 抽象工厂模式和工厂模式的区别就是工厂模式一次只生产一个系列的产品，而抽象工厂模式一次会生产多个系列的产品。
 * 客户端不关心具体的工厂到底具体创建了哪些产品。只需要根据逻辑，将对应的具体工厂实例赋值给抽象工厂即可
 * Author MarkOfHeaven
 * Date 2018/12/10
 */
public class Main {
    private static final String CAT = "cat";
    private static final String DOG = "dog";

    public static void main(String[] args){
        System.out.println("Prepare to create a cat and cat food.");
        try {
            createAnimalAndFood(CAT);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Prepare to create a dog and dog food.");
        try {
            createAnimalAndFood(DOG);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Prepare to test exception.");
        try {
            createAnimalAndFood("111");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    private static void createAnimalAndFood(String animalName) throws IllegalArgumentException{
        Factory factory = getFactory(animalName);
        Animal animal = factory.createAnimal();
        AnimalFood food = factory.createAnimalFood();
        animal.bark();
        food.printFoodName();
    }

    private static Factory getFactory(String animalName){
        switch (animalName){
            case CAT: return new CatFactory();
            case DOG: return new DogFactory();
            default: throw new IllegalArgumentException();
        }
    }
}
