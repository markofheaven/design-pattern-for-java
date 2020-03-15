package com.markofheaven.designpattern.command;

/**
 * Author: markofheaven
 * Date: 2020-03-15
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        lightOnCommand.execute();
        lightOffCommand.execute();
    }
}
