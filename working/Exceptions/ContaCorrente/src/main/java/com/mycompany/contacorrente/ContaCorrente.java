/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrente;

/**
 *
 * @author lucas
 */
public class ContaCorrente{

    private float amount;
    private float creditLimit;

    public ContaCorrente(float amount, float creditLimit) {
        this.amount = amount;
        this.creditLimit = creditLimit;
    }
    
    public void sacar(float value) throws NoAmountException{
        if (value <= 0){
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (value > amount + creditLimit){
            throw new NoAmountException("Saldo insuficiente para realizar o saque.");
        }
    }
    
    public void deposit (float value){
        if (value <= 0){
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        
        amount += value;
        System.out.println("Depósito de R$" + value + " realizado com sucesso. Saldo atual: R$ " + amount);
    }
    
    public void setLimitValue(float value){
        if (value < 0){
            throw new IllegalArgumentException("O valor do limite de crédito não pode ser negativo.");
        }
        
        creditLimit = value;
        System.out.println("Limite de crédito atualizado para R$" + creditLimit);
    }
}
