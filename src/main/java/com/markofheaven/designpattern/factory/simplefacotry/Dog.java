package com.markofheaven.designpattern.factory.simplefacotry;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/11/19
 */
public class Dog implements Animal {
    private static final String BARK_VOICE = "I'm a dog~";
    public void bark() {
        System.out.println(BARK_VOICE);
    }

}
