/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempoarraylinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lucas
 */

public class TempoArrayLinkedList {
    
    public static void main(String[] args) {
        // a) ArrayList
        long timeArrayListGet = timeArrayListGet();
        // b) ArrayList
        long timeArrayListRemoveInsert = timeArrayListRemoveInsert();
        // c) LinkedList
        long timeLinkedListGet = timeLinkedListGet();
        
        // d) Comparação de tempos
        System.out.println("Tempo gasto para acessar dados no ArrayList: " + timeArrayListGet + "ms");
        System.out.println("\nTempo gasto para remover e inserir dados no ArrayList: " + timeArrayListRemoveInsert + "ms");
        System.out.println("\nTempo gasto para acessar dados na LinkedList: " + timeLinkedListGet + "ms");
    }
    
    // a) ArrayList
    private static long timeArrayListGet(){
        int tam = 100000;
        
        List<Double> arrayList = new ArrayList<>();
        preencheLista(arrayList, tam);
        
        long tempoInicial = System.currentTimeMillis();
        
        Random random = new Random();
        for(int i=0; i<tam-1; i++){
            int randomIndex = random.nextInt(tam);
            arrayList.get(randomIndex);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }

    // Método para preencher a lista de maneira aleatória
    private static void preencheLista(List<Double> list, int size) {
        Random random = new Random();
        for (int i=0; i<size; i++){
            list.add(Math.random());
        }
    }
    
    // b) ArrayList
    private static long timeArrayListRemoveInsert(){
        int tam = 100000;
        
        List<Double> arrayList = new ArrayList<>();
        preencheLista(arrayList, tam);
        
        long tempoInicial = System.currentTimeMillis();
        
        Random random = new Random();
        for(int i=0; i<tam-1; i++){
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.remove(randomIndex);
            arrayList.add(Math.random());
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }
    
    // b) LinkedList
    private static long timeLinkedListGet(){
        int tam = 100000;
        
        List<Double> linkedList = new LinkedList<>();
        preencheLista(linkedList, tam);
        
        long tempoInicial = System.currentTimeMillis();
        
        Random random = new Random();
        for(int i=0; i<tam-1; i++){
            int randomIndex = random.nextInt(linkedList.size());
            linkedList.get(randomIndex);
        }
        long tempoFinal = System.currentTimeMillis();
        long time = tempoFinal - tempoInicial;
        
        return time;
    }
}
