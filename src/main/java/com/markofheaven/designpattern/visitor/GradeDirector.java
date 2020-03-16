package com.markofheaven.designpattern.visitor;

/**
 * 具体的访问者访问具体的数据，即某个数据处理方法处理实际的数据
 * 年级主任查询学生的名字
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class GradeDirector implements Teacher{
    @Override
    public void visit(PEStudent pe) {
        pe.getName();
    }

    @Override
    public void visit(CommonStudent common) {
        common.getName();
    }
}
