/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usp.comandolightexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
// Invoker
/*O historico de comandos nao eh parte do padrao Comando, esta aqui
apenas para incrementar as funcionalidades*/
class RemoteControl {
    private List<Command> history = new ArrayList<>();

    void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            lastCommand.execute(); // Undo by executing the opposite command
        }
    }
}
