/**
 * BracketStack.java
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        26/10/2026
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
            return;
        }
        else {
            newNode.next = top;
            top = newNode;
            return;
        }
        // connect newNode to the current top
        // update top
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        char data = top.data;
        top = top.next;
        return data;
        // After saving top.data, the new top should be the node that comes after the current top.
    }

    //  TODO 3: Return the top element without removing it
    public char peek() {
        if (top == null) {
            return '\0';
        }else {
            return top.data;
        }
        // Control if the stack is empty; if it is, then return null
        // if not return the data of the top
    }

    //  TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        // TODO
        if (top == null) {
            return true;
        }
        else {
            return false;
        }
    }
}