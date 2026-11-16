/**
 * Node.java
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        16/11/2026
 */

public class Node {

    String customerName;
    Node next;

    public Node(String customerName) {
  
        // Step 1: Store the customer's name.
        this.customerName = customerName;

        // Step 2: Initialize the next pointer as null.
        this.next = null;
    }
}
