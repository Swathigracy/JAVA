import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of courses
        int sumCredits = 0; // Initialize total credits
        double sumPoints = 0.0;
        // Initialize total points
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter points for course " + i + ":");
            int points = sc.nextInt();
            System.out.println("Enter credits for course " + i + ":");
            int credits = sc.nextInt();

            sumPoints += points * credits; // Accumulate points
            sumCredits += credits; // Accumulate credits
        }

        double CGPA = sumPoints / sumCredits; // Calculate CGPA

        System.out.println("Total credits: " + sumCredits);
        System.out.println("CGPA: " + CGPA);
    }
    //sc.close();
}
