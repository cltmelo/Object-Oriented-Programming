/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meusvetores;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class IntersecaoAlternativa implements OperacaoParaFactory {

    @Override
    public int[] executeOperation(int[] conjunto1, int[] conjunto2) {
        return Arrays.stream(conjunto1).filter(value -> Arrays.stream(conjunto2).anyMatch(x -> x == value)).toArray();
    }

    @Override
    public void showResults(int[] resultado) {
        System.out.println("Resultado Interseção: " + Arrays.toString(resultado));
    }
    
}
