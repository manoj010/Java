import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = scannerObj.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scannerObj.nextInt();
        System.out.println("Output: " + num1 * num2);
    }
}