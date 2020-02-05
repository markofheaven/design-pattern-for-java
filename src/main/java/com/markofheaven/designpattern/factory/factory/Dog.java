package com.markofheaven.designpattern.factory.factory;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/12/05
 */
public class Dog implements Animal {
    private static final String BARK_VOICE = "I'm a dog~";
    public void bark() {
        System.out.println(BARK_VOICE);
    }
}
