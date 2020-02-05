package com.markofheaven.designpattern.category;

import org.apache.commons.lang.StringUtils;

/** 策略模式和工厂模式最大的区别就是，策略模式是在客户端判断逻辑来实例化对象，传过去的是一个实例，使用的是实例中的具体方法。而工厂
 * 模式则是在客户端判断逻辑之后，传递过去一个标识，服务端根据标识的不同再来实例化对象。
 * Author MarkOfHeaven
 * Date 2019/01/03
 */
public class Main {
    private static final String DOG = "dog";
    private static final String CAT = "cat";
    public static void main(String[] args){
        Context context = new Context();

        Animal animal1 = getAnimal(CAT);
        context.setAnimal(animal1);
        System.out.println(context.askAnimalName());

        Animal animal2 = getAnimal(DOG);
        context.setAnimal(animal2);
        System.out.println(context.askAnimalName());
    }

    //客户端会有逻辑判断来实例化不同的类，然后将类传入Context，所以策略模式经常会和工厂模式（简单工厂，工厂，抽象工厂）一起使用
    private static Animal getAnimal(String animalName){
        if (StringUtils.equals(animalName, DOG)) {
            return new Dog();
        } else if (StringUtils.equals(animalName, CAT)){
            return new Cat();
        } else {
            return null;
        }
    }
}
