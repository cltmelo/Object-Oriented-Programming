/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meusvetores;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author lucas
 */
public class Uniao implements MeusVetoresBrigde {

    @Override
    public int[] executeOperation(MeusVetores conjuntos) {
        Set<Integer> conjunto1Set = Arrays.stream(conjuntos.getConjunto1()).boxed().collect(Collectors.toSet());
        Set<Integer> conjunto2Set = Arrays.stream(conjuntos.getConjunto2()).boxed().collect(Collectors.toSet());

        Set<Integer> uniaoSet = new HashSet<>(conjunto1Set);
        uniaoSet.addAll(conjunto2Set);

        return uniaoSet.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public void showResults(MeusVetores conjuntos) {
//        System.out.println("Conjunto 1: " + Arrays.toString(conjuntos.getConjunto1()));
//        System.out.println("Conjunto 2: " + Arrays.toString(conjuntos.getConjunto2()));
        System.out.println("Resultado União: " + Arrays.toString(executeOperation(conjuntos)));
        System.out.println();
    }
    
}
