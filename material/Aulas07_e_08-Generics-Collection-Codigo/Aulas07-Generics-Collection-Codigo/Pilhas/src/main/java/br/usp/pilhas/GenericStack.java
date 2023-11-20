package br.usp.pilhas;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class GenericStack<T> {
    private Object[] stack;
    private int top;
    private int capacity;

    public GenericStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
        this.top = -1; // Initialize top to -1 to indicate an empty stack
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        T value = (T) stack[top];
        stack[top--] = null; // Set the reference to null for garbage collection
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        T value = (T) stack[top];
        return value;
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

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Integer Stack size: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        System.out.println("Popped element: " + intStack.pop());
        System.out.println("Popped element: " + intStack.pop());

        System.out.println("Integer Stack size after pops: " + intStack.size());

        GenericStack<String> stringStack = new GenericStack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        System.out.println("\nString Stack size: " + stringStack.size());
        System.out.println("Top element: " + stringStack.peek());

        System.out.println("Popped element: " + stringStack.pop());
        System.out.println("Popped element: " + stringStack.pop());

        System.out.println("String Stack size after pops: " + stringStack.size());
    }
}

