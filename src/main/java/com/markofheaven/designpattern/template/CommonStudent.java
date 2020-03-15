package com.markofheaven.designpattern.template;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class CommonStudent extends Student {
    @Override
    public void startForenoonLecture() {
        System.out.println("Study Mathematics");
        System.out.println("Study English.");
    }

    @Override
    public void startAfternoonLecture() {
        System.out.println("Study Chinese.");
        System.out.println("Study physics");
    }
}
