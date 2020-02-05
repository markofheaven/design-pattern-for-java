package com.markofheaven.designpattern.factory.simplefacotry;

/**
 *
 * Author MarkOfHeaven
 * Date 2018/11/19
 */
public class Cat implements Animal{
    private static final String BARK_VOICE = "I'm a cat~";

    public void bark() {
        System.out.println(BARK_VOICE);
    }
}
