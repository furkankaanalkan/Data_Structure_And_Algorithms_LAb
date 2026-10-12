/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        12/10/2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {

        Node newData = new Node(data);
        
        if (head == null ){
            head = newData;
            return;
        }

        Node currentData = head;
        
        while (currentData.next != null){
            currentData = currentData.next;
        }
        
        currentData.next = newData;
        
        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {

        Node currentData = head;

        while (currentData != null){
            System.out.print(currentData.data + " --> ");
            currentData = currentData.next;
        }
        System.out.println("NULL");
        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print the data values in this format:
        //
        // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
    }

    // -------------------------------------------------------
    // Find the middle node
    Node recurrent;
    public Node findMiddle() {
        
        Node currentData = head;
        int counter = 0;
        int count = 0;

        while (currentData != null){
            counter++;
            currentData = currentData.next;
        }

        int middle = counter / 2 + 1;

        currentData = head;
        while (currentData != null){
            count++;
            if(middle == count){
                //System.out.println("middle --> " + currentData.data);
                recurrent = currentData;
                return recurrent;
            }
            currentData = currentData.next;
        }

        return recurrent;
        // TODO:
        //
        // Find and return the middle node.
        // For an odd number of nodes:
        //     1 --> 2 --> 3 --> 4 --> 5
        //                 ^
        //              middle
        //
        // For an even number of nodes:
        //     10 --> 20 --> 30 --> 40 --> 50 --> 60
        //                          ^
        //                        middle
        // IMPORTANT:
        // For an even-sized list, return the SECOND
        // middle node.
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}