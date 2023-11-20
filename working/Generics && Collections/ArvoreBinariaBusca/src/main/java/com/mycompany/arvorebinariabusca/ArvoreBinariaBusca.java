/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arvorebinariabusca;

/**
 *
 * @author lucas
 */
public class ArvoreBinariaBusca<T extends Comparable<T>> {
    
    private Node<T> raiz;
    
    public void insert(T valor){
        raiz = insertRecursive(raiz, valor);
    }
    private Node<T> insertRecursive(Node<T> node, T valor) {
        if (node == null) {
            return new Node<>(valor);
        }

        if (valor.compareTo(node.valor) < 0) {
            node.left = insertRecursive(node.left, valor);
        } else if (valor.compareTo(node.valor) > 0) {
            node.right = insertRecursive(node.right, valor);
        }
        return node;
    }
    
    public void remove(T valor){
        raiz = removeRecursive(raiz, valor);
    }
    private Node<T> removeRecursive(Node<T> node, T valor){
        if(node == null){
            return null;
        }
        
        if(valor.compareTo(node.valor)<0){
            node.left = removeRecursive(node.left, valor);
        }else if(valor.compareTo(node.valor)>0){
            node.right = removeRecursive(node.right, valor);
        }else{
            if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }
            
            node.valor = findMin(node.right).valor;
            node.right = removeRecursive(node.right, node.valor);
        }
        return node;
    }
    public Node<T> findMin(Node<T> node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
    public boolean search(T valor){
        return searchRecursive(raiz, valor);
    }
    private boolean searchRecursive(Node<T> node, T valor){
        if(node == null){
            return false;
        }
        if(valor.equals(node.valor)){
            return true;
        }
        
        return valor.compareTo(node.valor)<0 ? searchRecursive(node.left, valor) : searchRecursive(node.right, valor);
    }
    public void printSorted(){
        printSortedRecursive(raiz);
    }
    private void printSortedRecursive(Node<T> node){
        if(node != null){
            printSortedRecursive(node.left);
            System.out.println(node.valor + " ");
            printSortedRecursive(node.right);
        }
    }

    public static void main(String[] args) {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();

        arvore.insert(5);
        arvore.insert(3);
        arvore.insert(7);
        arvore.insert(2);
        arvore.insert(4);
        arvore.insert(6);
        arvore.insert(8);

        System.out.println("Árvore após a inserção: ");
        arvore.printSorted();

        arvore.remove(5);

        System.out.println("\nÁrvore após a remoção do valor 5: ");
        arvore.printSorted();

        System.out.println("\nBuscar o valor 6 na árvore: " + arvore.search(6));
        System.out.println("Buscar o valor 10 na árvore: " + arvore.search(10));
    }   
}