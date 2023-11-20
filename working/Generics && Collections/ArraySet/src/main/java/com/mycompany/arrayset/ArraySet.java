/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class ArraySet<T> implements Set<T> {
    
    private ArrayList<T> list = new ArrayList<>();

    public static void main(String[] args) {
        long length = 100000;
        
        // Comparando com HashSet
        Set<Integer> hashSet = new HashSet<>();
        ArraySet<Integer> arraySet = new ArraySet<>();

        // Adicionando elementos
        long startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet - Tempo para adicionar " + length + " elementos: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            arraySet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArraySet - Tempo para adicionar " + length + " elementos: " + (endTime - startTime) + " ns");

        // Verificando a contagem de elementos
        System.out.println("HashSet - Contagem de elementos: " + hashSet.size());
        System.out.println("ArraySet - Contagem de elementos: " + arraySet.size());

        // Removendo elementos
        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet - Tempo para remover 100,000 elementos: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < length; i++) {
            arraySet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArraySet - Tempo para remover 100,000 elementos: " + (endTime - startTime) + " ns");
    }

    
    

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(T e) {
        if(!contains(e)){
            return list.add(e);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }
}
