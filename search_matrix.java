import java.util.Scanner;

class search_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (a[i][j] == key) {
                    System.out.println("Element found at row "
                            + (i + 1) + " column " + (j + 1));

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}