import java.util.Scanner;

class Queue {

    int front = -1;
    int rear = -1;
    int size;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int data) {

        if (rear == size - 1) {
            System.out.println("Queue is full");
        } 
        else {

            if (front == -1) {
                front = 0;
            }

            rear++;
            arr[rear] = data;

            System.out.println(data + " enqueued into queue");
        }
    }

    void dequeue() {

        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } 
        else {

            System.out.println("Dequeued element is: " + arr[front]);
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    void peek() {

        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } 
        else {
            System.out.println("Front element is: " + arr[front]);
        }
    }
}

public class queue_array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue:");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        while (true) {

            System.out.println("\nEnter choice:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the element to be enqueued:");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}