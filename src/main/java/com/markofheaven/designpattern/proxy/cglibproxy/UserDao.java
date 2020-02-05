package com.markofheaven.designpattern.proxy.cglibproxy;

/**
 * 没有实现任何接口的目标对象

 */
public class UserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
