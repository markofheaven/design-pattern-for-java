package com.markofheaven.designpattern.state;

/**
 * 糖果机，糖果机要持有所有的状态，并在初始化的时候，要设置其开始的状态，然后糖果的各个行为，就委托到了各个状态中自己维护
 */
public class CandyMachine {
    State mSoldOutState;
    State mOnReadyState;
    State mHasCoin;
    State mSoldState;
    State mWinnerState;
    private State state;
    private int count = 0;

    public CandyMachine(int count) {
        this.count = count;
        mSoldOutState = new SoldOutState(this);
        mOnReadyState = new OnReadyState(this);
        mHasCoin = new HasCoin(this);
        mSoldState = new SoldState(this);
        mWinnerState = new WinnerState(this);
        if (count > 0) {
            state = mOnReadyState;
        } else {
            state = mSoldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseCandy() {

        // TODO Auto-generated method stub
        if (count > 0) {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }

    }

    public int getCount() {
        return count;
    }

    public void printState() {
        state.printState();
    }
}
