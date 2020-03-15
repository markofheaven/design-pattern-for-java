package com.markofheaven.designpattern.command;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }

    @Override
    public void undo() {
        light.turnOnLight();
    }
}
