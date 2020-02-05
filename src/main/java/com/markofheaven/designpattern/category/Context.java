package com.markofheaven.designpattern.category;

/** 这个是调用策略的类，或者说策略的使用环境（之前看了好多次，都没有理解过来）。策略模式是为了方便调用不同的算法，通过替换传入的算法，
 * 可以很方便的实现算法之间的替代。（算法是一个广义的概念，我理解达到某个目的的一连串行为组合起来，就是算法。在这里，算法的目的就是
 * 询问动物的名字，因此这里的getName就是算法。猫和狗的getName是两个不同的实现，就是两种不同的算法。它们是等价的。具体调用哪一种算法，
 * 则是由客户端来决定。一行代码的执行也是算法。）
 * Author MarkOfHeaven
 * Date 2019/01/03
 */
public class Context {
    private Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public String askAnimalName(){
        return animal.getName();
    }
}
