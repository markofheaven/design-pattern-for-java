package com.markofheaven.designpattern.state;

/**
 * 样例来源：http://www.cnblogs.com/pony1223/p/7518226.html
 * 状态模式定义：对象行为的变化是由于状态的变化引入，那么即当内部状态发生变化的时候，就会改变对象的行为，而这种改变视乎就改变了整个类。
 * 个人初步理解状态模式
 * 1当后续新增状态时，可以尽可能修改少的类，测试的时候，只需要测试与新状态有关系的几个类就可以了。
 * 2在设置初始状态之后，对象可以自动在状态之间正确的流转
 * 3客户不感知状态，状态管理由系统完成
 */
public class Main {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);

        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();
    }
}
