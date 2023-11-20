/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericqueue;

/**
 *
 * @author lucas
 */
public class GenericQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public GenericQueue(int capacity) {
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }
    
    /**
     *
     * Adiciona um elemento à fila
     * @param value Valor a ser adicionado a fila
     */
    public void enqueue(T value){
        if(isFull()){
            throw new IllegalStateException("Queue is full. Cannot enqueue" + value);
        }
        
        rear = (rear+1)%capacity;
        queue[rear] = value;
        size++;
    }

    /**
     *
     * Remove e retorna o elemtno do ínicio da fila
     * @return Elemento removido da fila
     */
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        
        T value = (T) queue[front];
        queue[front] = null;
        front = (front+1)%capacity;
        size--;
        
        return value;
    }
    
    /**
     *
     * Retorna o elemento do ínicio da fila sem removê-lo
     * @return Elemento do ínicio da fila
     */
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        
        return (T) queue[front];
    }

    /**
     *
     * Verifica se a fila está cheia
     * @return true se a fila estiver cheia, false c.c
     */
    public boolean isFull(){
        return size == capacity;
    }

    /**
     *
     * Verifica se a fila está vazia
     * @return true se a fila estiver vazia, false c.c
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     *
     * Retorna o tamanho atual da fila
     * @return Tamanho da fila
     */
    public int size(){
        return size;
    }
    

    public static void main(String[] args) {
        GenericQueue<Integer> intQueue = new GenericQueue<>(5);
        try {
            intQueue.enqueue(10);
            intQueue.enqueue(20);
            intQueue.enqueue(30);

            System.out.println("Integer Queue size: " + intQueue.size());
            System.out.println("Front element: " + intQueue.peek());

            System.out.println("Dequeued element: " + intQueue.dequeue());
            System.out.println("Dequeued element: " + intQueue.dequeue());

            System.out.println("Integer Queue size after dequeues: " + intQueue.size());

            GenericQueue<String> stringQueue = new GenericQueue<>(5);
            stringQueue.enqueue("Hello");
            stringQueue.enqueue("World");
            stringQueue.enqueue("Java");

            System.out.println("\nString Queue size: " + stringQueue.size());
            System.out.println("Front element: " + stringQueue.peek());

            System.out.println("Dequeued element: " + stringQueue.dequeue());
            System.out.println("Dequeued element: " + stringQueue.dequeue());

            System.out.println("String Queue size after dequeues: " + stringQueue.size());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
