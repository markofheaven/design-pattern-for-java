package com.markofheaven.designpattern.visitor;

/**
 * http://c.biancheng.net/view/1397.html
 * 适用于数据结构稳定，但数据处理方法多变的场景。访问者模式可以将数据处理方法从数据结构中分离出来，并可以随时扩展处理方法
 * Author: markofheaven
 * Date: 2020-03-16
 */
public class Main {
    public static void main(String[] args) {
        StudentRecord record = new StudentRecord();
        Student pe = new PEStudent();
        Student common = new CommonStudent();
        record.add(pe);
        record.add(common);

        Teacher classTeacher = new ClassTeacher();
        record.accept(classTeacher);

        Teacher gradeDirector = new GradeDirector();
        record.accept(gradeDirector);
    }
}
