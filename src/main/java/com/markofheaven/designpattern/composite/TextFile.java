package com.markofheaven.designpattern.composite;

public class TextFile implements File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("我是一个text文件。文件名：" + getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
