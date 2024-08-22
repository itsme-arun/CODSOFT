import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        int totalAttempts = 0;
        int roundsWon = 0;
        int roundsPlayed = 0;

        do {
            int numberToGuess = random.nextInt(100) + 1; // Generate a number between 1 and 100
            int attempts = 0;
            int maxAttempts = 7; // Maximum number of attempts allowed
            int guess;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100!");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            // Game loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    roundsWon++;
                    break;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The correct number was " + numberToGuess);
            }

            totalAttempts += attempts;
            roundsPlayed++;

            // Display the user's score after each round
            System.out.println("Rounds Played: " + roundsPlayed);
            System.out.println("Rounds Won: " + roundsWon);
            System.out.println("Total Attempts: " + totalAttempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        System.out.println("Final Score:");
        System.out.println("Rounds Played: " + roundsPlayed);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Total Attempts: " + totalAttempts);

        scanner.close();
    }
}
