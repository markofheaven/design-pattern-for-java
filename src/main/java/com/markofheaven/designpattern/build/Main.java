package com.markofheaven.designpattern.build;

public class Main {
    public static void main(String[] args) {
        Build build = new BuildImpl();
        Director director = new Director(build);
        director.construct("主板", "显示器", "操作系统");
        Computer computer = build.create();
        System.out.println("board: " + computer.getBoard());
        System.out.println("display: " + computer.getDisplay());
        System.out.println("os: " + computer.getOs());
    }
}
