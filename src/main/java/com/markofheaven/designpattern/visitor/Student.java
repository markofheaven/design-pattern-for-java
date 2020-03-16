package com.markofheaven.designpattern.visitor;

/**
 * 数据接口。为了让访问者可以访问，具体的数据类型需要实现这个接口
 * Author: markofheaven
 * Date: 2020-03-17
 */
public interface Student {
    void accept(Teacher teacher);
}
