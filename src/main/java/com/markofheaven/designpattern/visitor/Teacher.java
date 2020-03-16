package com.markofheaven.designpattern.visitor;

/**
 * 访问者接口，即数据处理方法的抽象。具体数据处理方法就是要访问数据的人，即访问者。
 * 这里的访问者是老师，被访问的数据是学生
 * Author: markofheaven
 * Date: 2020-03-16
 */
public interface Teacher {
    void visit(PEStudent pe);

    void visit(CommonStudent common);
}
