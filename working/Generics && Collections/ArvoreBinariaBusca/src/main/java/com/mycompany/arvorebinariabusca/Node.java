/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorebinariabusca;

/**
 *
 * @author lucas
 */
public class Node<T> {
    T valor;
    
    Node<T> left, right;
    public Node(T valor) {
        this.valor = valor;
        left = null;
        right = null;
    }
    
    
}
