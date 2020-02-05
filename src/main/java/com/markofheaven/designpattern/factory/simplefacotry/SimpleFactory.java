package com.markofheaven.designpattern.factory.simplefacotry;

import org.apache.commons.lang.StringUtils;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/11/19
 */
public class SimpleFactory {
    public static final String CAT_NAME = "cat";
    public static final String DOG_NAME = "dog";

    public static Animal createAnimal(String animalName){
        if (StringUtils.equals(animalName, CAT_NAME)){
            return new Cat();
        }
        else if (StringUtils.equals(animalName, DOG_NAME)){
            return new Dog();
        }
        else{
            return null;
        }
    }
}
