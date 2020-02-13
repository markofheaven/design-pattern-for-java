package com.markofheaven.designpattern.facade;

/**
 * https://www.cnblogs.com/adamjwh/p/9048594.html
 * 通俗易懂的描述了外观模式。但文中的例子没有体现出依赖倒置，而是直接依赖的实体。我这里略作修改
 * Author: markofheaven
 * Date: 2020-02-13
 */
public class Client {
    public static void main(String[] args) {
        Fund fund = new FundService();
        fund.buy();
        fund.sell();
    }
}
