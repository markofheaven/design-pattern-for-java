package com.markofheaven.designpattern.template;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class PEStudent extends Student {
    @Override
    protected void goSchool() {
        System.out.println("Live in school.");
    }

    @Override
    protected void startForenoonLecture() {
        System.out.println("Practice running.");
        System.out.println("Study Mathematics.");
    }

    @Override
    protected void startAfternoonLecture() {
        System.out.println("Study English.");
        System.out.println("Practice weight lift.");
    }

    @Override
    protected void goHome() {
        System.out.println("Go school dormitory.");
    }
}
