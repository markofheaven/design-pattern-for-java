package com.markofheaven.designpattern.mediator;

/**
 * 中介者接口，用于注册同事和触发同事之间的交互动作
 * Author: markofheaven
 * Date: 2020-03-18
 */
public interface Mediator {
    void register(Colleague colleague);

    void relay(Colleague colleague);
}
