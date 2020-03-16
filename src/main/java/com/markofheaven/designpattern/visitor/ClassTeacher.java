package com.markofheaven.designpattern.visitor;

/**
 * 具体的访问者访问具体的数据，即某个数据处理方法处理实际的数据
 * 班主任查询学生的成绩
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class ClassTeacher implements Teacher{
    @Override
    public void visit(PEStudent pe) {
        pe.queryRunningScore();
    }

    @Override
    public void visit(CommonStudent common) {
        common.getMathematicsScore();
    }
}
