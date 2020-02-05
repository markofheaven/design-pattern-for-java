package com.markofheaven.designpattern.adapter.classAdapter;

/**
 * 类适配器类
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
