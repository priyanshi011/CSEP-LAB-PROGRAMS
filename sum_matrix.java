import java.util.Scanner;

class sum_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int sum = 0;

        System.out.println("Enter matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}