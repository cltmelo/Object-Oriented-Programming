/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;

/**
 *
 * @author lucas
 */
public class Pilha<T> {
    private static final int TAM = 5; // limitando o tamanho máximo da pilha
    private int top;
    private T[] elems;

    public Pilha() {
        top = -1;
        elems = (T[]) new Object[TAM];
    }
    
    /**
     *
     * @throws PilhaCheiaException
     */
    public void push(T elem) throws PilhaCheiaException {
        if (top == TAM-1){
            throw new PilhaCheiaException("A pilha está cheia. Não é possível adicionar mais elementos.");
        }
        elems[++top] = elem;
        System.out.println("Elemento " + elem + " adicionado à pilha.");
    }

    /**
     *
     * @throws PilhaVaziaException
     */
    public void pop() throws PilhaVaziaException {
        if (top == -1){
            throw new PilhaVaziaException("A pilha está vazia. Não há elementos para remover.");
        }
        System.out.println("Elemento " + elems[top--] + " foi removido da pilha.");
    }
}
