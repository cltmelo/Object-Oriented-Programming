/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericinsertionsort;

/**
 *
 * @author lucas
 */
public class Compare implements Comparable<Compare> {
    int valor;

    public Compare(int valor){
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
    

    // @Override
    public int compareTo(Compare o) {
        return Integer.compare(this.valor, o.valor);
    }
    
}
