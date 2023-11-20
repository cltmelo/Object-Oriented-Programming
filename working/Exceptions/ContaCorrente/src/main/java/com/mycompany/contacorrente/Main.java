/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrente;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        try {
            ContaCorrente conta = new ContaCorrente(1000, 500);
            
            conta.sacar(800);
            conta.deposit(200);
            conta.setLimitValue(600);
            
            // Tentativa de saque com valor maior que saldo + limite
            conta.sacar(1200);

            // Tentativa de depósito com valor zero
            conta.deposit(0);

        } catch (NoAmountException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
