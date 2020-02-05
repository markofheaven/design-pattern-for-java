package com.markofheaven.designpattern.build;

/**
 * 最终构建的产品类
 */
public class Computer {
    private String board;
    private String display;
    private String os;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
