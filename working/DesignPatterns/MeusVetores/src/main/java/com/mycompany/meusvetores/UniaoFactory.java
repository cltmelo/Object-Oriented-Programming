/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meusvetores;

/**
 *
 * @author lucas
 */
public class UniaoFactory implements OperacaoVetoresFactory {

    @Override
    public OperacaoParaFactory criarOperacao() {
        return new UniaoAlternativa();
    }
    
}
