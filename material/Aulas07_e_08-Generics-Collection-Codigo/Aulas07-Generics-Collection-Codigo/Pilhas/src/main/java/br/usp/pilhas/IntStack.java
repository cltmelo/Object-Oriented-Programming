package br.usp.pilhas;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class IntStack {
    private int[] stack;
    private int top;
    private int capacity;

    public IntStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; // Initialize top to -1 to indicate an empty stack
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate an empty stack
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack
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

