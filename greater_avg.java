import java.util.Scanner;

class greater_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);
        System.out.println("Elements greater than average:");

        for (int i = 0; i < n; i++) {
            if (a[i] > average) {
                System.out.print(a[i] + " ");
            }
        }
    }
}