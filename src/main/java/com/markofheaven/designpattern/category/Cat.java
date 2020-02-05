package com.markofheaven.designpattern.category;

/**
 * Author MarkOfHeaven
 * Date 2019/01/03
 */
public class Cat implements Animal{
    private static final String name = "I'm a cat~~";
    @Override
    public String getName() {
        return name;
    }
}
