import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //usermove S, P, R
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your move -> Scissors(S), Paper(P), Rock(R): ");
        char userMove = userInput.next().charAt(0);
//        System.out.println(userMove);

        //computermove
//        int min = 1;
//        int max = 3;
//        char compMove;
//        int comp = (int)Math.floor(Math.random() * (max - min + 1) + min);
//        if (comp == 1) {
//            compMove = 'S';
//        } else if (comp == 2) {
//            compMove = 'P';
//        } else {
//            compMove = 'R';
//        }
//        System.out.println(compMove);


        char[] arr = {'S', 'P', 'R'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove = arr[guessNumber];

        System.out.println("Your Choice: " + userMove);
        System.out.println("Computer's Choice: " + computerMove);

        if (userMove == computerMove) {
            System.out.println("Draw!");
        } else if (userMove == 'R' && computerMove == 'S') {
            System.out.println("You Win!");
        } else if (userMove == 'P' && computerMove == 'R') {
            System.out.println("You Win!");
        } else if (userMove == 'S' && computerMove == 'P') {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}