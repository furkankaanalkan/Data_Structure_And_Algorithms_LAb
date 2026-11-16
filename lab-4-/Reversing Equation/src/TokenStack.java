/**
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        26/10/2026
 */

public class TokenStack {

    private class Node {
        // create the instant named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;

        // cpmplete the constructor accordinally
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assigned the top pointer to null
        top = null;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        // TODO: Create a new node.
        //       Connect it to the current top.
        //       Update top.
    }

    public String pop() {
        if (top == null) {
            return null;
        }else {
            String storedData = top.data;
            top = top.next;
            return storedData;
        }
        // TODO: Check whether the stack is empty.
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }else {
            return false;
        }
        // TODO: Return whether the stack is empty.
    }
}