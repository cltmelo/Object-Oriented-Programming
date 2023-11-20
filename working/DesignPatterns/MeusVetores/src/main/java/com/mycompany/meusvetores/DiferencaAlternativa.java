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
public class DiferencaAlternativa implements OperacaoParaFactory {

    @Override
    public int[] executeOperation(int[] conjunto1, int[] conjunto2) {
        return Arrays.stream(conjunto1).filter(value -> Arrays.stream(conjunto2).noneMatch(x -> x == value)).toArray();
    }

    @Override
    public void showResults(int[] resultado) {
        System.out.println("Resultado Diferença: " + Arrays.toString(resultado));
    }
    
}
