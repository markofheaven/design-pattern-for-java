package com.markofheaven.designpattern.build;

/**
 * 构建产品的接口
 */
public interface Build {
    /**
     * 构建主机
     */
    void setBoard(String board);

    /**
     * 构建显示器
     */
    void setDisplay(String display);

    /**
     * 构建操作系统
     */
    void setOs(String os);

    /**
     * 构建产品
     */
    Computer create();
}
