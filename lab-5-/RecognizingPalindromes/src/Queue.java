/**
 * Queue.java
 *
 * Your Name: Furkan Kaan Alkan
 * Your Student ID: 240444034
 * Your Date: 16/11/2026
 */

public class Queue {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {

        items = new char[capacity];

        // Initialize front, rear, and count.
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) {

        // Step 1: Check whether the queue is full.
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        // Step 2: Calculate the next rear position
        // using circular indexing.
        rear = (rear + 1) % items.length;

        // Step 3: Insert the character into the array.
        items[rear] = value;

        // Step 4: Increase count.
        count++;
    }

    public char dequeue() {

        // Step 1: Check whether the queue is empty.
        if (isEmpty()) {
            return '\0';
        }

        // Step 2: Store the character at the front position.
        char value = items[front];

        // Step 3: Move front to the next position
        // using circular indexing.
        front = (front + 1) % items.length;

        // Step 4: Decrease count.
        count--;

        // Step 5: Return the removed character.
        return value;
    }

    public char peek() {

        // Check whether the queue is empty.
        if (isEmpty()) {
            return '\0';
        }

        // Return the front character without removing it.
        return items[front];
    }

    public boolean isEmpty() {

        // Return true if the queue is empty.
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {

        // Return true if the queue is full.
        if (count == items.length) {
            return true;
        }
        return false;
    }

    public int size() {

        // Return the number of elements in the queue.
        return count;
    }
}
