import java.util.*;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Set the maximum number of attempts
        int maxAttempts = 10;

        // Start the game
        int attempts = 0;
        boolean won = false;
        while (attempts < maxAttempts && !won) {
            System.out.println("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                won = true;
                System.out.println("You guessed the number correctly! You won!");
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            attempts++;
        }

        if (!won) {
            System.out.println("You lost! The number was " + randomNumber);
        }

        // Display the score
        int score = maxAttempts - attempts;
        System.out.println("Your score is " + score);
    }
}

