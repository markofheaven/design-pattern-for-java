package com.markofheaven.designpattern.prototype;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume("Tom");
        Resume resumeCopy = resume.clone();

        System.out.println("resume display: ");
        resume.display();
        System.out.println("copy resume display: ");
        resumeCopy.display();

        System.out.println("Equal: " + (resume == resumeCopy));
    }
}
