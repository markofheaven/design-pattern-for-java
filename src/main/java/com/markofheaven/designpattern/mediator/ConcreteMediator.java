package com.markofheaven.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: markofheaven
 * Date: 2020-03-18
 */
public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague msgFrom) {
        String message = msgFrom.getMessage();
        colleagues.stream().filter(msgTo -> msgFrom != msgTo).forEach(msgTo -> msgTo.receive(message));
    }
}
