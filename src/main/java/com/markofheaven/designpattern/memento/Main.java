package com.markofheaven.designpattern.memento;

/**
 * http://c.biancheng.net/view/1400.html
 * 备忘录模式就是将一个对象的状态（即字段值或其它什么东西）保存下来，在需要的时候再设置回去。例子中只保存
 * 了一个字段，且只有一个状态快照。实际中字段和状态快照都可以有多个。
 * Author: markofheaven
 * Date: 2020-03-19
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State 1");
        Memeto memeto = originator.createMemeto();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemeto(memeto);

        originator.setState("State 2");
        originator.restore(caretaker.getMemeto());

        System.out.println(originator.getState());
    }
}
