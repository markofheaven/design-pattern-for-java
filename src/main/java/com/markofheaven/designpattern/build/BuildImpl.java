package com.markofheaven.designpattern.build;

/**
 * 产品构建的实现类
 */
public class BuildImpl implements Build{
    private Computer computer = new Computer();

    @Override
    public void setBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void setDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void setOs(String os) {
        computer.setOs(os);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
