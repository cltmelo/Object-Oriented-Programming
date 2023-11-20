/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usp.pilhas;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class StringStack {
    private String[] stack;
    private int top;
    private int capacity;

    public StringStack(int capacity) {
        this.capacity = capacity;
        this.stack = new String[capacity];
        this.top = -1; // Initialize top to -1 to indicate an empty stack
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // Return null to indicate an empty stack
        }
        return stack[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null; // Return null to indicate an empty stack
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

}

