import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scannerObj = new Scanner(System.in);
        String name = scannerObj.nextLine();
        System.out.println("What is the name of supervisor?");
        String name2 = scannerObj.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Your name is " + name2);
    }
}