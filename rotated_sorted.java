import java.util.Scanner;

class rotated_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;

            if (a[i] > a[next]) {
                count++;
            }
        }

        if (count <= 1) {
            System.out.println("Array is rotated sorted");
        } else {
            System.out.println("Array is not rotated sorted");
        }
        sc.close();
    }
}