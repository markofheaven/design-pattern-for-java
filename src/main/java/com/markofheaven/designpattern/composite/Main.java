package com.markofheaven.designpattern.composite;

/**
 * https://www.cnblogs.com/chenssy/p/3299719.html
 *
 * 组合模式组合多个对象形成树形结构以表示“整体-部分”的结构层次
 * 角色包括叶子节点和非叶子节点。它们实现了同一个接口（或者继承了同一个抽象类），具有同样的方法。客户端
 * 在使用它们的时候可以不加区分的直接调用接口（抽象类）中的方法。当然，叶子节点和非叶子节点的实现肯定不同。
 *
 */
public class Main {
    public static final void main(String[] args) {
        Folder mainFolder = new Folder("主文件夹");

        TextFile textFile1 = new TextFile("main.txt");
        mainFolder.add(textFile1);

        VideoFile videoFile1 = new VideoFile("main.rmvb");
        mainFolder.add(videoFile1);

        Folder subFolder = new Folder("子文件夹");
        mainFolder.add(subFolder);

        TextFile textFile2 = new TextFile("sub.text");
        subFolder.add(textFile2);

        VideoFile videoFile2 = new VideoFile("sub.rmvb");
        subFolder.add(videoFile2);

        mainFolder.display();
    }

}
