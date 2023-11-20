/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        try {
            pilha.push(1);
            pilha.push(2.2);
            pilha.push(3);
            pilha.push(4);
            pilha.push(5);

            // Tentando adicionar mais elementos do que o permitido
            pilha.push(6);
        } catch (PilhaCheiaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            pilha.pop();
            pilha.pop();
            pilha.pop();
            pilha.pop();
            pilha.pop();

            // Tentando remover elementos de uma pilha vazia
            pilha.pop();
        } catch (PilhaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
