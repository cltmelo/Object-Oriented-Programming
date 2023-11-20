/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempoarraylisthashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author lucas
 * DEU RUIM NESTE AQUI!!!!
 */
public class TempoArrayListHashSet {

    public static void main(String[] args) {
        long tam = 1000;

        // a) ArrayList e ArrayAuxiliar
        ArrayList<Double> arrayList = new ArrayList<>();
        Object[] arrayAuxiliar = new Object[(int)tam];
        preencheArrayList(arrayList, (int)(10*tam));
        preencheArrayAuxiliar(arrayList, arrayAuxiliar);
        
        // b) ArrayList.contains
        long timeArrayListContains = timeArrayListContains(arrayList, arrayAuxiliar);
        
        // c) HashSet
        HashSet<Double> hashSet = new HashSet<>();
        preencheHashSet(hashSet, (int)(10*tam));
        
        // d) Comparação dos tempos
        long timeHashSetContains = timeHashSetContains(hashSet, arrayAuxiliar);
        
        // Impressão dos resultados
        System.out.println("Tempo para ArrayList.contains: " + timeArrayListContains + " ms");
        System.out.println("\nTempo para HashSet.contains: " + timeHashSetContains + " ms");
    }
    
    // a) Preencher ArrayList + preeencher arrayAuxiliar
    
    private static void preencheArrayList(ArrayList<Double> arrayList,int quant){
        Random random = new Random();
        for (int i=0; i<quant; i++){
            arrayList.add(Math.random());
        }
    }
    private static void preencheArrayAuxiliar(ArrayList<Double> arrayList, Object[] arrayAuxiliar){
        long tam = 1000;
        
        Random random = new Random();
        for (int i=0; i<tam; i++){
            int randomIndex = random.nextInt((int)(10*tam));
            arrayAuxiliar[i] = arrayList.get(randomIndex);
        }
    }
    
    // b) ArrayList.contains
    
    private static long timeArrayListContains(ArrayList<Double> arrayList, Object[] arrayAuxiliar){
        long tempoInicial = System.currentTimeMillis();
        for (Object elem : arrayAuxiliar){
            arrayList.contains(elem);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoInicial - tempoFinal;
        return time;
    }
    
    // c) Preencher HashSet
    
    private static void preencheHashSet(HashSet<Double> hashSet,int quant){
        Random random = new Random();
        for (int i=0; i<quant; i++){
            hashSet.add(Math.random());
        }
    }
    
    // b) ArrayList.contains
    
    private static long timeHashSetContains(HashSet<Double> hashSet, Object[] arrayAuxiliar){
        long tempoInicial = System.currentTimeMillis();
        for (Object elem : arrayAuxiliar){
            hashSet.contains(elem);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoInicial - tempoFinal;
        return time;
    }
}
