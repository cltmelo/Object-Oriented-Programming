package br.usp.pilhas;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class FloatStack {
    private float[] stack;
    private int top;
    private int capacity;

    public FloatStack(int capacity) {
        Integer i;
        this.capacity = capacity;
        this.stack = new float[capacity];
        this.top = -1; // Initialize top to -1 to indicate an empty stack
    }

    public void push(float value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public float pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return Float.NaN; // Return NaN to indicate an empty stack
        }
        return stack[top--];
    }

    public float peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return Float.NaN; // Return NaN to indicate an empty stack
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

