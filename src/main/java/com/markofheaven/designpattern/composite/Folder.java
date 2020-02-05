package com.markofheaven.designpattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 文件夹，文件夹也是一种文件，但是不能直接读取它，而是需要读取它下面的子文件夹或文件
 */
public class Folder implements File {
    private List<File> subFiles;
    private String name;

    public Folder(String name) {
        this.name = name;
        subFiles = new LinkedList<>();
    }

    // 添加一个子文件夹或文件
    public void add(File file) {
        subFiles.add(file);
    }

    // 还可以实现删除或其他的什么功能
    // ....

    // 文件夹的展示就是把子文件夹和文件全部展示出来
    @Override
    public void display() {
        System.out.println("我是一个文件夹。文件夹名：" + getName());
        subFiles.forEach(File::display);
    }

    @Override
    public String getName() {
        return name;
    }
}
