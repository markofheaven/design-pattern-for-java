package com.markofheaven.designpattern.proxy.staticproxy;

/**
 * 样例来源：https://www.cnblogs.com/cenyu/p/6289209.html
 *
 * 初步分析静态代理和装饰模式的区别，后续有更深入理解之后再更新。静态代理和装饰模式一样，调用目标对象的方法，并且可以在目标方法的前后
 * 添加新的内容。但是装饰模式可以有多个装饰类，并且装饰类之间还可以互相装饰。而代理则是一次。不用于多次代理。（感觉没解释通，代理模式
 * 也可以多次代理，没毛病啊。光死记看来作用不大）
 */
public class Main {
    public static void main(String[] args){
        //目标对象，被代理
        UserDao userDao = new UserDaoImpl();
        UserDaoProxyImpl proxy = new UserDaoProxyImpl(userDao);
        proxy.save();
    }
}
