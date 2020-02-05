package com.markofheaven.designpattern.factory.factory;

import org.apache.commons.lang.StringUtils;

import java.util.Objects;

/**
 * Description 工厂模式与简单工厂模式最大的不同就在于工厂模式符合了开放-封闭原则。具体表现就是工厂模式中，产生产品的逻辑是在客户端
 * 中，这样添加新的产品类时，不会修改原有的代码；修改已有产品类时，不会影响到其它部分。
 * 简单工厂模式
 * @see com.markofheaven.designpattern.factory.simplefacotry.Main
 *
 * Author MarkOfHeaven
 * Date 2018/12/04
 */
public class Main {
    private static String DOG = "dog";
    private static String CAT = "cat";
    public static void main(String[] args){
        String animalName = CAT;
        AnimalFactory factory = getConcreteFactory(animalName);
        if (Objects.isNull(factory)){
            return;
        }
        //在具体的动物工厂实例化后，就不再关心animal对应的是哪个具体动物了
        Animal animal = factory.createAnimal();
        animal.bark();
    }

    /**
     * 这里就是客户端来判断具体实例化哪一个具体产品工厂的逻辑
     * @param animalName
     * @return
     */
    private static AnimalFactory getConcreteFactory(String animalName){
        if (StringUtils.equals(animalName, DOG)){
            return new DogFactory();
        }
        else if(StringUtils.equals(animalName, CAT)){
            return new CatFactory();
        }
        else{
            return null;
        }
    }
}
