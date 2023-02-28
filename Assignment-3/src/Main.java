import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;
        int count = 0;
        boolean userGuess = false;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10. You have 5 chances!!!");

        while (count < 5) {
            System.out.println("Guess the number (Chance: " + (count + 1) + "):");
            int guessNum = userInput.nextInt();
            count++;

            if (guessNum < randomNum) {
                System.out.println(guessNum + " is too low, please guess higher number.");
                System.out.println("You have " + (5 - count) + " chances left.");
            } else if (guessNum > randomNum) {
                System.out.println(guessNum + " is too high, please guess lower number.");
                System.out.println("You have " + (5 - count) + " chances left.");
            } else {
                userGuess = true;
                System.out.println("You guessed it correct.");
                break;
            }
        }

        if (userGuess) {
            System.out.println("You took " + count + " chances to guess the number.");
        } else {
            System.out.println("You didn't guess the number. The number was " + randomNum + ".");
        }
    }
}
