import java.util.Scanner;

class diagonal_largersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary = primary + a[i][i];
            secondary = secondary + a[i][n - 1 - i];
        }

        System.out.println("Primary diagonal sum = " + primary);
        System.out.println("Secondary diagonal sum = " + secondary);

        if (primary > secondary) {
            System.out.println("Primary diagonal has larger sum");
        } else if (secondary > primary) {
            System.out.println("Secondary diagonal has larger sum");
        } else {
            System.out.println("Both sums are equal");
        }
    }
}