package com.markofheaven.designpattern.command;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }

    @Override
    public void undo() {
        light.turnOffLight();
    }
}
