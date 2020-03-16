package com.markofheaven.designpattern.visitor;

/**
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class CommonStudent implements Student{

    @Override
    public void accept(Teacher teacher) {
        teacher.visit(this);
    }

    public void getMathematicsScore() {
        System.out.println("Query common student mathematics score.");
    }

    public void getName() {
        System.out.println("Query common student's name.");
    }
}
