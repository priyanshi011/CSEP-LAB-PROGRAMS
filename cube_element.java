import java.util.Scanner;

class cube_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] cube = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cube[i] = a[i] * a[i] * a[i];
        }

        System.out.println("Cubes:");
        for (int i = 0; i < n; i++) {
            System.out.print(cube[i] + " ");
        }
        sc.close();
    }
}