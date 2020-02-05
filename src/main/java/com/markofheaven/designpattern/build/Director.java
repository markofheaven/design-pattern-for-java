package com.markofheaven.designpattern.build;

/**
 * 组装类，将build构建的产品部件组装成产品，对外隐藏实现细节
 */
public class Director {

    private Build build;

    public Director(Build build) {
        this.build = build;
    }

    public void construct(String board, String display, String os){
        build.setBoard(board);
        build.setDisplay(display);
        build.setOs(os);
    }
}
