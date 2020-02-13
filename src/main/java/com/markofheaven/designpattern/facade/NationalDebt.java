package com.markofheaven.designpattern.facade;

/**
 * Author: markofheaven
 * Date: 2020-02-13
 */
public class NationalDebt implements Stock{
    @Override
    public void buy() {
        System.out.println("Buy national debt.");
    }

    @Override
    public void sell() {
        System.out.println("Sell national debt");
    }
}
