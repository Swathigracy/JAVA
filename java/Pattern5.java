import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}

