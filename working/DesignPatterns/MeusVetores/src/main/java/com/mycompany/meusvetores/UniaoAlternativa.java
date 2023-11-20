/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meusvetores;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class UniaoAlternativa implements OperacaoParaFactory {

    @Override
    public int[] executeOperation(int[] conjunto1, int[] conjunto2) {
        Set<Integer> conjunto1Set = new HashSet<>();
        for (int num : conjunto1) {
            conjunto1Set.add(num);
        }

        Set<Integer> conjunto2Set = new HashSet<>();
        for (int num : conjunto2) {
            conjunto2Set.add(num);
        }

        conjunto1Set.addAll(conjunto2Set);

        return conjunto1Set.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public void showResults(int[] resultado) {
        System.out.println("Resultado União: " + Arrays.toString(resultado));
    }
    
}
