import java.util.Scanner;

class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + (position + 1));
        }
    }
}