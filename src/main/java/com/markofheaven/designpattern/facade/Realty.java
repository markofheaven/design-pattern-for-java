package com.markofheaven.designpattern.facade;

/**
 * Author: markofheaven
 * Date: 2020-02-13
 */
public class Realty implements Stock{

    @Override
    public void buy() {
        System.out.println("Buy realty.");
    }

    @Override
    public void sell() {
        System.out.println("Sell realty");
    }
}
