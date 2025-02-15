import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the upper part: ");
        int n = sc.nextInt();

        // Upper Part
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print stars with spaces in between
            System.out.print("*");
            if (i > 1) {
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower Part
        for (int l = 0; l < 2 * n + 1; l++) {
            System.out.print("*");
        }
        System.out.println();

        sc.close();
    }
}


