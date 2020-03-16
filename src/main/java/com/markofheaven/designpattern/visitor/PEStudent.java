package com.markofheaven.designpattern.visitor;

/**
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class PEStudent implements Student {
    @Override
    public void accept(Teacher teacher) {
        teacher.visit(this);
    }

    public void queryRunningScore() {
        System.out.println("Query P.E. Student's running score.");
    }

    public void getName() {
        System.out.println("Query P.E. student's name.");
    }
}
