/**
 * Queue.java
 * Your Name: Furkan Kaan Alkan
 * Your Student ID: 240444034
 * Your Date: 16/11/2026
 */

public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {

        // Step 1: Initialize front and rear as null.
        this.front = null;
        this.rear = null;

        // Step 2: Initialize size as 0.
        this.size = 0;
    }

    public void enqueue(String customerName) {

        // Step 1: Create a new Node using customerName.
        Node newNode = new Node(customerName);

        // Step 2: Check whether the queue is empty.
        // Step 3: If the queue is empty:
        // - Set front to the new node.
        // - Set rear to the new node.
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            // Step 4: Otherwise:
            // - Connect the current rear node to the new node.
            // - Update rear to the new node.
            rear.next = newNode;
            rear = newNode;
        }

        // Step 5: Increase size.
        size++;
    }

    public String dequeue() {

        // Step 1: Check whether the queue is empty.
        // If empty, return null.
        if (isEmpty()) {
            return null;
        }

        // Step 2: Store the customer name at the front.
        String customerName = front.customerName;

        // Step 3: Move front to the next node.
        front = front.next;

        // Step 4: If front becomes null:
        // - Set rear to null.
        if (front == null) {
            rear = null;
        }

        // Step 5: Decrease size.
        size--;

        // Step 6: Return the removed customer's name.
        return customerName;
    }

    public boolean isEmpty() {

        // Step 1: Check whether front is null.
        if (front == null) {
            return true;
        }
        return false;
    }

    public int size() {

        // Step 1: Return the current size.
        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.customerName);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}
