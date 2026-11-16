/**
 * Stack.java
 *
 * Your Name: Furkan Kaan Alkan
 * Your Student ID: 240444034
 * Your Date: 16/11/2026
 */

public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];

        // Initialize top to indicate an empty stack.
        top = -1;
    }

    public void push(char value) {

        // Step 1: Check whether the stack is full.
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        // Step 2: Increase top.
        top++;

        // Step 3: Insert the character at the top position.
        items[top] = value;
    }

    public char pop() {

        // Step 1: Check whether the stack is empty.
        if (isEmpty()) {
            return '\0';
        }

        // Step 2: Store the character at the top position.
        char value = items[top];

        // Step 3: Decrease top.
        top--;

        // Step 4: Return the removed character.
        return value;
    }

    public char peek() {

        // Check whether the stack is empty.
        if (isEmpty()) {
            return '\0';
        }

        // Return the character at the top without removing it.
        return items[top];
    }

    public boolean isEmpty() {

        // Return true if the stack is empty.
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {

        // Return true if the stack is full.
        if (top == items.length - 1) {
            return true;
        }
        return false;
    }
}
