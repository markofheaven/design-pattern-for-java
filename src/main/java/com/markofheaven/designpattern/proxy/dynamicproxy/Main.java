package com.markofheaven.designpattern.proxy.dynamicproxy;

/**
 * 样例来源：https://www.cnblogs.com/cenyu/p/6289209.html
 * 实际上动态代理是不需要实现接口的
 */
public class Main {
    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
        System.out.println("被代理对象的类型：" + userDao.getClass());

        //创建目标对象的代理
        UserDao proxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();
        //内存中动态生成的代理对象
        System.out.println("内存中的动态代理对象类型：" + proxy.getClass());
        //执行方法
        proxy.save();
    }
}
