package com.markofheaven.designpattern.proxy.staticproxy;

/**
 * 静态代理对象
 */
public class UserDaoProxyImpl implements UserDao {
    private UserDao target;

    public UserDaoProxyImpl(UserDao target){
        this.target = target;
    }
    @Override
    public void save() {
        System.out.println("开始事物");
        target.save(); //执行目标对象的方法
        System.out.println("提交事物");
    }
}
