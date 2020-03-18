package com.markofheaven.designpattern.mediator;

/**
 * 中介者模式。当若干个对象之间需要交互时，会形成一个网状的关系图，非常复杂。但是假如交互动作交给一个中间对象，那么这些对象的耦合
 * 性就大大降低了。
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.send();

        colleague2.send();
    }
}
