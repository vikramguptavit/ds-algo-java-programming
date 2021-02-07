package com.vikram;

public class Stack {
    int capacity;
    int array[];
    int top;

    Stack(int sizeOfStack) {
        capacity = sizeOfStack;
        array = new int[capacity];
        top = -1;
    }

    void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full!!! No more push operations are allowed.");
            return;
        }
        System.out.println("Inserting element : " + element + " into the stack.");
        this.array[++top] = element;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!! Cannot perform pop operation.");
            return -1;
        }
        System.out.println("Removing element :" + this.array[top] + " from the stack");
        return this.array[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!! Cannot perform peek operation.");
            return -1;
        }
        System.out.println("Peek of the stack is : " + this.array[top]);
        return this.array[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == (capacity - 1));
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.push(30);
        stack.pop();
        stack.peek();
    }
}
