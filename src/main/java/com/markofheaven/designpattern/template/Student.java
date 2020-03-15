package com.markofheaven.designpattern.template;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public abstract class Student {
    public void startSchoolDay() {
        goSchool();
        startForenoonLecture();
        eatLunch();
        startAfternoonLecture();
        goHome();
    }

    protected void goSchool() {
        System.out.println("Go school.");
    }

    protected abstract void startForenoonLecture();

    protected void eatLunch() {
        System.out.println("Eat lunch.");
    }

    protected abstract void startAfternoonLecture();

    protected void goHome() {
        System.out.println("Go home.");
    }
}
