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
public class Diferenca implements MeusVetoresBrigde {

    @Override
    public int[] executeOperation(MeusVetores conjuntos) {
        return (int[]) Arrays.stream(conjuntos.getConjunto1()).filter(value -> Arrays.stream(conjuntos.getConjunto2()).noneMatch(x -> x == value)).toArray();
    }

    @Override
    public void showResults(MeusVetores conjuntos) {
//        System.out.println("Conjunto 1: " + Arrays.toString(conjuntos.getConjunto1()));
//        System.out.println("Conjunto 2: " + Arrays.toString(conjuntos.getConjunto2()));
        System.out.println("Resultado Diferença: " + Arrays.toString(executeOperation(conjuntos)));
        System.out.println();
    }
    
}
