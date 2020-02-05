package com.markofheaven.designpattern.composite;

public class VideoFile implements File {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("我是一个video文件。文件名：" + getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
