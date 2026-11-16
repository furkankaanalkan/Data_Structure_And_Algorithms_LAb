/**
 * Queue.java
 *
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        16/11/2026
 */


public class QueueDemo {

    public static void main(String[] args) {

        String[] students = {
            "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
            "Elif", "Mustafa", "Fatma", "Can", "Ece",
            "Burak", "Deniz", "Emre", "Selin", "Mert",
            "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // TODO: Create your Queue object with capacity 10.
        Queue<String> queue = new Queue<>(10);

        // TODO: Insert the first 10 student names into the queue.
        // Use a for loop.
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        // TODO: Display the original queue.
        System.out.println("Original Queue: " + queue);

        // TODO: Display the queue size.
        System.out.println("Queue Size: " + queue.size());

        // TODO: Display the first student using peek().
        System.out.println("First Student: " + queue.peek());


        // TODO: Remove three students using dequeue().
        // Display the name of each removed student.
        for (int i = 0; i < 3; i++) {
            String removedStudent = queue.dequeue();
            System.out.println("Removed Student: " + removedStudent);
        }

        // TODO: Display the remaining queue.
        System.out.println("Remaining Queue: " + queue);

        // TODO: Display the final queue size.
        System.out.println("Final Queue Size: " + queue.size());

        //QUESTION: if I want to add the student[11], (because I have dequeue 3 student so there is empty parts in the array)
        // Try the code bellow and give an answer to: why does it give an error? and what can you use to add the 11 student to the array?
        //queue.enqueue(students[11]);
        //System.out.println("Queue Size: " + queue.size());
    }
}
