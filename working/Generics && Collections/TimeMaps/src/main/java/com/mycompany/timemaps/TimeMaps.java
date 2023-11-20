/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timemaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author lucas
 */
public class TimeMaps {

    public static void main(String[] args) {
        long tam = 1000000;
        
        // Parte a) - HashMap
        Map<Integer, Double> hashMap = new HashMap<>();
        int[] keysAuxiliares = new int[(int)tam/10];
        preencheHashMap(hashMap, keysAuxiliares);

        // Parte b) - HashMap.get
        long timeHashMapGet = timeHashMapGet(hashMap, keysAuxiliares);

        // Parte c) - Cálculo direto
        long timeStraightCalculus = timeStraightCalculus(keysAuxiliares);

        // Parte d) - Comparação de tempos
        System.out.println("Tempo gasto para HashMap.get: " + timeHashMapGet + " ms");
        System.out.println("Tempo gasto para cálculo direto: " + timeStraightCalculus + " ms");

        // Parte e) - TreeMap
        Map<Integer, Double> treeMap = new TreeMap<>();
        preencheHashMap(treeMap, keysAuxiliares);

        // Parte f) - TreeMap.get
        long timeTreeMapGet = timeTreeMapGet(treeMap, keysAuxiliares);

        // Comparação de tempos para TreeMap
        System.out.println("Tempo gasto para TreeMap.get: " + timeTreeMapGet + " ms");
    }

    
    // a) Preencher HashMap
    private static void preencheHashMap(Map<Integer, Double> hashMap, int[] keysAuxiliares) {
        long tam = 1000000;
        
        Random random = new Random();
        for(int i=0; i<tam; i++){
            int key = random.nextInt();
            double value = Math.hypot(key * 2/3, Math.sqrt(key * 2/3));
            hashMap.put(key, value);
            
            if(i<tam/10){
                keysAuxiliares[i] = key;
            }
        }
    }
    
    // b) HashMAp.get
    private static long timeHashMapGet(Map<Integer, Double> hashMap, int[] keysAuxiliares){
        long tempoInicial = System.currentTimeMillis();
        for (int key : keysAuxiliares){
            hashMap.get(key);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }
    
    // c) Calculo direto
    private static long timeStraightCalculus(int[] keysAuxiliares){
        long tempoInicial = System.currentTimeMillis();
        for (int key : keysAuxiliares){
            Math.hypot(key * 2/3, Math.sqrt(key * 2/3));
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }
    
    // f) TreeMap.get
    private static long timeTreeMapGet(Map<Integer, Double> treeMap, int[] keysAuxiliares) {
        long tempoInicial = System.currentTimeMillis();
        for (int key : keysAuxiliares){
            treeMap.get(key);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }
}
