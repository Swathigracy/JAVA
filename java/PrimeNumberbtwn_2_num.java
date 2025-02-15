import java.util.Scanner;

public class PrimeNumberbtwn_2_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Loop through each number between a and b
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int j = 2; j <i; j++) {
            if (i % j == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        return true; // No divisors found, it's a prime number
    }
}

