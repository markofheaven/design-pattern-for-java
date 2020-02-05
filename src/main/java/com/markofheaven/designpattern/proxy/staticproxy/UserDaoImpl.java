package com.markofheaven.designpattern.proxy.staticproxy;

/**
 * 实现接口的目标对象，被代理的对象
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("--已经保存数据！--");
    }
}
