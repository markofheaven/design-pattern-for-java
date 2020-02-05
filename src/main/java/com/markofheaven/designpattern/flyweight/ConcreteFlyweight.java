package com.markofheaven.designpattern.flyweight;

import lombok.Data;

@Data
public class ConcreteFlyweight implements FlyWeight{
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元被调用。Key: " + key);
        System.out.println("非享元信息：" + state.getInfo());
    }
}
