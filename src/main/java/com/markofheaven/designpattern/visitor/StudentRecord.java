package com.markofheaven.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 学生的记录表
 * Author: markofheaven
 * Date: 2020-03-17
 */
public class StudentRecord {
    private List<Student> students = new LinkedList<>();

    public void accept(Teacher teacher) {
        if (teacher != null) {
            students.forEach(student -> student.accept(teacher));
        }
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        }
    }
}
