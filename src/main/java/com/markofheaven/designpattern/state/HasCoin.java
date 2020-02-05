package com.markofheaven.designpattern.state;

import java.util.Random;

/**
 * 准备状态
 * 我们会发现里面存在一个糖果机的属性，而之所以存在这个属性，就是因为糖果机中持有所有的状态，
 * 而在准备状态下，肯定会由于某种行为发生状态改变，而要改变的状态都在糖果机中，所以持有一个糖果机属性
 */
public class HasCoin implements State {
    private CandyMachine mCandyMachine;

    public HasCoin(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert another coin!");
    }

    @Override
    public void returnCoin() {
        System.out.println("coin return!");
        mCandyMachine.setState(mCandyMachine.mOnReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("crank turn...!");
        Random ranWinner = new Random();
        int winner = ranWinner.nextInt(10);
        if (winner == 0) {
            mCandyMachine.setState(mCandyMachine.mWinnerState);
        } else {
            mCandyMachine.setState(mCandyMachine.mSoldState);
        }
    }

    @Override
    public void dispense() {
    }

    @Override
    public void printState() {
        System.out.println("***HasCoin***");
    }
}
