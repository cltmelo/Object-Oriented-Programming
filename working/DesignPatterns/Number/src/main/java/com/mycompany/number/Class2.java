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
public class Class2 implements Chain {
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Number request) {
        if (request.getNumber() % 3 == 0) {
            System.out.println("Classe1: Raiz do número " + request.getNumber() + ": " + Math.sqrt(request.getNumber()));
        } else {
            nextChain.calculate(request);
        }
    }
    
}
