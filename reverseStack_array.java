import java.util.Scanner;
class Stack {
    int top = -1;
    int size;
    int[] arr;
    
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = data;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int pop = arr[top];
            top--;
            return pop;
        }
    }
}

public class reverseStack_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        Stack stack = new Stack(size);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            stack.push(arr[i]); 
        }

        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


