package com.markofheaven.designpattern.facade;

/**
 * Author: markofheaven
 * Date: 2020-02-13
 */
public class FundService implements Fund{
    private Stock nationalDebt;

    private Stock realty;

    public FundService() {
        this.nationalDebt = new NationalDebt();
        this.realty = new Realty();
    }
    @Override
    public void buy() {
        nationalDebt.buy();
        realty.buy();
    }

    @Override
    public void sell() {
        nationalDebt.sell();
        realty.sell();
    }
}
