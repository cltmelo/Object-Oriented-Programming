package com.mycompany.number;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.number.Chain;

/**
 *
 * @author lucas
 */
public class Class3 implements Chain {
    @Override
    public void setNextChain(Chain nextChain) {
        // Não há próximo na cadeia
    }

    @Override
    public void calculate(Number request) {
        System.out.println("Classe3: Número " + request.getNumber() + " não é múltiplo de 2 nem 3.");
    }
    
}
