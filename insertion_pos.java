import java.util.Scanner;

class insertion_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n + 1];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        for (int i = n; i >= pos; i--) {
            a[i] = a[i - 1];
        }

        a[pos - 1] = element;

        System.out.println("Array after insertion:");

        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}