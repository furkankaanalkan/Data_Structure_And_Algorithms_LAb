/**
 * Queue.java
 *
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        16/11/2026
 */

public class Queue<T> {

    private T[] items;
    private int front; // first element of the queue
    private int rear;  // last element of the queue
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        items = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T value) {
        // Step 1 Check whether the queue is full.
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }

        // Step 2: Calculate the next rear position.
        rear = (rear + 1) % items.length;

        // Step 3: Insert the new element into the array.
        items[rear] = value;

        // Step 4: Increase count.
        count++;
    }

    public T dequeue() {
        // TODO: Check whether the queue is empty.
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        // TODO: Store the element at the front position.
        T removedElement = items[front];

        // TODO: Move front to the next position.
        front = (front + 1) % items.length;

        // TODO: Decrease count.
        count--;

        // TODO: Return the removed element.
        return removedElement;
    }

    public T peek() {
        // TODO: Check whether the queue is empty.
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }

        // TODO: Return the front element without removing it.
        return items[front];
    }

    public boolean isEmpty() {
        // TODO: Check whether count is zero.
        return count == 0;
    }

    public boolean isFull() {
        // TODO: Check whether count equals the array capacity.
        return count == items.length;
    }

    public int size() {
        // TODO: Return the number of elements.
        return count;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
    
}