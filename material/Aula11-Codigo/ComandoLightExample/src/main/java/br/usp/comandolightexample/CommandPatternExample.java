/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usp.comandolightexample;

/**
 *
 * @author Jose F Rodrigues-Jr
 */

// Client
public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn on the light
        remote.executeCommand(turnOnCommand);

        // Turn off the light
        remote.executeCommand(turnOffCommand);
    }
}

