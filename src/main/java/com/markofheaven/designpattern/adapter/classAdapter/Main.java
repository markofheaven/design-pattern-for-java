package com.markofheaven.designpattern.adapter.classAdapter;

/**
 * http://c.biancheng.net/view/1361.html
 */
public class Main {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
