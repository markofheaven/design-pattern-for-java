package com.markofheaven.designpattern.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    private static HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    public static FlyWeight getFlyWeight(String key) {
        if (!flyWeights.containsKey(key)) {
            flyWeights.put(key, new ConcreteFlyweight(key));
        }
        return flyWeights.get(key);
    }
}
