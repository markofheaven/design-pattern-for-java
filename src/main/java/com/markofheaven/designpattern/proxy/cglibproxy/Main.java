package com.markofheaven.designpattern.proxy.cglibproxy;

/**
 * 样例来源：https://www.cnblogs.com/cenyu/p/6289209.html
 * 实际上并没有太深入的理解到这么做的意义何在，还是见少了
 */
public class Main {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        System.out.println("目标对象类型：" + target.getClass());
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象类型： " + proxy.getClass());
        proxy.save();
    }
}
