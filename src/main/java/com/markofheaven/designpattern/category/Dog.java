package com.markofheaven.designpattern.category;

/**
 * Author MarkOfHeaven
 * Date 2019/01/03
 */
public class Dog implements Animal {
    private static final String name = "I'm a dog~~";
    @Override
    public String getName() {
        return name;
    }
}
