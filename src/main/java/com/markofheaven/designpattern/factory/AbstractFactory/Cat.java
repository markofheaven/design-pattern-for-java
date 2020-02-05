package com.markofheaven.designpattern.factory.AbstractFactory;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/12/10
 */
public class Cat implements Animal{
    private static final String BARK_VOICE = "I'm a cat~";
    @Override
    public void bark() {
        System.out.println(BARK_VOICE);
    }
}
