import java.util.Random;
import java.util.Scanner;

public class Number_Game {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int minRange = 1;
        int maxRange = 50;
        int maxAttempts = 6; // Set maximum attempts to 6

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(maxRange - minRange + 1) + minRange; 
            int numTries = 0; 

            System.out.println("\nGuess a number between " + minRange + " and " + maxRange + ".");

            while (numTries < maxAttempts) { 
                System.out.print("Enter your guess: ");
                int guess;

                try {
                    guess = scanner.nextInt(); 
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.nextLine(); // Clear the invalid input
                    continue; // Skip to the next iteration of the loop
                }

                numTries++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + numTries + " attempt(s)!");
                    break; 
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (numTries >= maxAttempts) { // Check for max attempts reached
                System.out.println("Sorry, you've reached the maximum number of attempts.");
                System.out.println("The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes"); 
        }

        scanner.close();
    }
}