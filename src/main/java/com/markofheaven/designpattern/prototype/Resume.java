package com.markofheaven.designpattern.prototype;

public class Resume implements Cloneable{
    private String name;

    public Resume(String name) {
        this.name = name;
    }

    @Override
    public Resume clone() {
        Resume resume= null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    public void display() {
        System.out.println("name: " + name);
    }
}
