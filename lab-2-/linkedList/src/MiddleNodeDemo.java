/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:        Furkan Kaan Alkan
 * Student ID:  240444034
 * Date:        12/10/2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO: 
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node

        SinglyLinkedList listodd = new SinglyLinkedList();

        listodd.add(1);
        listodd.add(2);
        listodd.add(3);
        listodd.add(4);
        listodd.add(5);
        
        

        System.out.println("List 1: ");

        listodd.display();
        System.out.println("Middle Node: " + listodd.findMiddle().data);
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node

        SinglyLinkedList listEven = new SinglyLinkedList();

        listEven.add(10);
        listEven.add(20);
        listEven.add(30);
        listEven.add(40);
        listEven.add(50);
        listEven.add(60);

        System.out.println("List 2: ");

        listEven.display();

        System.out.println("Middle Node: " + listEven.findMiddle().data);
        System.out.println();
    }
}