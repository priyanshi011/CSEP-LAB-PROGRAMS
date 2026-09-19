import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {
    Node head;

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Count number of nodes / Find length
    public int getLength() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Find middle point of linked list (returns data of middle node)
    public int findMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // Linear search for an element
    public boolean search(int key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Element " + key + " found at position index: " + index);
                return true;
            }
            current = current.next;
            index++;
        }
        return false;
    }

    // Insertion at Head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at Tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insertion at a given position (0-indexed)
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Deletion at Head
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    // Deletion at Tail
    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Deletion at a given position (0-indexed)
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 0) {
            deleteAtHead();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        current.next = current.next.next;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // 1. Hardcoded input
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        System.out.println("Hardcoded Initial List:");
        list.display();

        // 2. Count / Length
        System.out.println("Length of Linked List: " + list.getLength());

        // 3. Middle point
        System.out.println("Middle Element: " + list.findMiddle());

        // 4. Search element
        list.search(20);

        // 5. Insertions
        list.insertAtHead(5); // Insert at head
        list.insertAtTail(40); // Insert at tail
        list.insertAtPosition(2, 15); // Insert 15 at position 2
        System.out.println("\nList after Insertions:");
        list.display();

        // 6. Deletions
        list.deleteAtHead(); // Delete head
        list.deleteAtTail(); // Delete tail
        list.deleteAtPosition(2); // Delete position 2
        System.out.println("\nList after Deletions:");
        list.display();

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a value to add to the tail (User Input): ");
        int val = scanner.nextInt();
        list.insertAtTail(val);
        System.out.println("List after User Input addition:");
        list.display();
        scanner.close();
    }
}


