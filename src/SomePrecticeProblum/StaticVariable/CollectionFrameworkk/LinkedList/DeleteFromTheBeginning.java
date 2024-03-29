package SomePrecticeProblum.StaticVariable.CollectionFrameworkk.LinkedList;


class Node {

    int number;
    Node next;
}
public class DeleteFromTheBeginning {

    // this method adds a new node with a value A to the front of the linked list
    public static Node push(Node head, int A){

        Node n = new Node(); // Create a new Node
        n.number = A; // Assign the value A to the node
        n.next = head; // Set the next node as the new node to be the current head
        head = n; // Set the new node as the head of the linked list
        return head;
    }

    // this method deletes the node at the given position from the linked list
    public static Node deleteN(Node head, int position){
        Node temp = head; // create a temporary node pointing to the head of the linked list
        Node prev = head; // create a previous node pointing to the head pf the linked list

        for (int i = 0; i < position; i++){
            // loop through the linked list find the node at the given position
            if (i == 0  && position == 1){
                // If the node to delete is the head
                head = head.next; // set the next node as the new head
            }else {
                if (i == position - 1 && temp != null) {
                    // If the node to delete is found
                    prev.next = temp.next; // Set the next node of the previous node to be the next node of the current node
                }else {
                    prev = temp; // Move the temporary node to the next node
                }
            }
        }
        return head; // Return the new head of the linked list
    }

    // This method prints the linked list
    public static void printList(Node head){
        while (head != null){
            // Loop through the linked list
            if (head.next == null){
                // If the current node is the last node
                System.out.println("[" + head.number + "] [" + head + "] ->" + "(null)"); // Print the node value and null
            }else {
                System.out.println("[" + head.number + "] [" + head + "] ->" + head.next); // Print the node value and the next
            }
            head = head.next; // Move to the next node
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        Node list = new Node(); // create a new linked list
        list.next = null; // Set the next node of the first node to be null
        list = push(list, 1); // Add node with value 1 to the linked list
        list = push(list, 2); // Add node with value 2 to the linked list
        list = push(list, 3); // Add node with value 3 to the linked list

        printList(list); // Print the linked list

        // Delete node at position 1 from the linked list
        list = deleteN(list, 1);
        printList(list); // Print the update list

        list = push(list, 4); // Add node with value 4 to the linked list
        printList(list); // Print the update list


    }

}
