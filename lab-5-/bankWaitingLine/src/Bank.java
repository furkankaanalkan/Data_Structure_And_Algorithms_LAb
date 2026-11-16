/**
 * Your Name: Furkan Kaan Alkan
 * Your Student ID: 240444034
 * Your Date: 16/11/2026
 * 
 * The Bank class manages three tellers and one waiting queue.
 *
 * We will use a String array to represent the three teller positions:
 * - tellers[0] represents Teller 1.
 * - tellers[1] represents Teller 2.
 * - tellers[2] represents Teller 3.
 * - null means that the teller is available.
 */

public class Bank {

    private String[] tellers;
    private Queue waitingQueue;

    public Bank() {

        // Step 1: Create a String array with 3 elements for tellers.
        tellers = new String[3];

        // Step 2: Initialize all teller positions as null.
        for (int i = 0; i < tellers.length; i++) {
            tellers[i] = null;
        }

        // Step 3: Create a waiting Queue object.
        waitingQueue = new Queue();
    }

    public void arrive(String customerName) {

        // Step 1: Display the customer's arrival message. (Ex: "Customer " + customerName + " arrived.")
        System.out.println("Customer " + customerName + " arrived.");

        // Step 2: Search for an available teller.
        // An available teller has a null value.
        // Step 3: If an available teller is found:
        // - Assign the customer to that teller.
        // - Display the teller assignment message. (Ex: customerName + " is assigned to Teller " + (i + 1) + ".")
        for (int i = 0; i < tellers.length; i++) {
            if (tellers[i] == null) {
                tellers[i] = customerName;
                System.out.println(customerName + " is assigned to Teller " + (i + 1) + ".");
                System.out.println();
                return;
            }
        }

        // Step 4: Otherwise:
        // - Add the customer to waitingQueue using enqueue().
        // - Display a waiting message. (Ex: customerName + " joins the waiting queue.")
        System.out.println("All tellers are busy.");
        System.out.println(customerName + " joins the waiting queue.");
        System.out.println();
        waitingQueue.enqueue(customerName);
    }

    public void completeTransaction(int tellerNumber) {

        // Step 1: Check whether tellerNumber is between 1 and 3. If not, return and print a message "Invalid teller number!"
        if (tellerNumber < 1 || tellerNumber > 3) {
            System.out.println("Invalid teller number!");
            System.out.println();
            return;
        }

        // Step 2: Check whether the teller is already available. If (tellers[index] == null) then print a message "Teller " + tellerNumber + " is already available."
        int index = tellerNumber - 1;
        if (tellers[index] == null) {
            System.out.println("Teller " + tellerNumber + " is already available.");
            System.out.println();
            return;
        }

        // Step 3: Display the completed customer's name. (Ex: "Teller " + tellerNumber + " completed " + tellers[index] + "'s transaction.")
        System.out.println("Teller " + tellerNumber + " completed " + tellers[index] + "'s transaction.");

        // Step 4: Set the selected teller position to null.
        tellers[index] = null;

        // Step 5: Call assignNextCustomer(tellerNumber) for that teller.
        assignNextCustomer(tellerNumber);
        System.out.println();
    }

    public void assignNextCustomer(int tellerNumber) {

        // Step 1: Check whether there are customers waiting. (empty)
        if (waitingQueue.isEmpty()) {
            System.out.println("No customers in the waiting queue.");
            return;
        }

        // Step 2: If it is not empty: (!waitingQueue.isEmpty())
        // - Create a String nextCustomer and Remove it from the queue using dequeue().
        // - Assign that customer to the available teller.
        // - Display the assignment message. (Ex: nextCustomer + " is assigned to Teller " + tellerNumber + ".")
        String nextCustomer = waitingQueue.dequeue();
        tellers[tellerNumber - 1] = nextCustomer;
        System.out.println(nextCustomer + " is assigned to Teller " + tellerNumber + ".");
    }

    public void displayStatus() {

        System.out.println("---------- BANK STATUS ----------");

        // Display the status of all tellers.
        for (int i = 0; i < tellers.length; i++) {
            System.out.print("Teller " + (i + 1) + ": ");

            if (tellers[i] == null) {
                System.out.println("Available");
            } else {
                System.out.println(tellers[i]);
            }
        }

        // Display the waiting queue.
        System.out.print("Waiting Queue: ");
        waitingQueue.display();

        System.out.println("---------------------------------");
        System.out.println();
    }
}
