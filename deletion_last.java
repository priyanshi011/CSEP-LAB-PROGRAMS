import java.util.Scanner;

class deletion_begg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array after deletion:");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}