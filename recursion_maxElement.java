import java.util.Scanner;
public class recursion_maxElement {
static int max(int[] arr, int i) {

    // base case
    if (i == arr.length - 1) {
        return arr[i];
    }

    // recursive call
    int maxOfRest = max(arr, i + 1);

    // compare current element with answer from rest
    return Math.max(arr[i], maxOfRest);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxElement = max(arr, 0);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
    
}
