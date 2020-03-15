package com.markofheaven.designpattern.template;

/**
 * 与策略模式的区别在于策略模式是将整个算法做替换，而模板模式则是只替换算法中的某一部分。当然模板模式公共部分也可以由子类改写
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class Main {
    public static void main(String[] args) {
        Student common = new CommonStudent();
        common.startSchoolDay();

        Student pe = new PEStudent();
        pe.startSchoolDay();
    }
}
