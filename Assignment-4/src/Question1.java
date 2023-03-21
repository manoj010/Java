import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Multiplication Table\n2) Currency Converter\n3) Fibonacci Series ");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number: ");
                int num = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + num * i);
                }
                break;

            case 2:
                System.out.println("Enter value (USD): ");
                double value = input.nextDouble();
                System.out.println(value + " USD" + "  =  " + value * 135.03 + " NPR");
                break;

            case 3:
                int a = 0;
                int b = 1;
                int c;
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter n numbers: ");
                int upto = input2.nextInt();
                System.out.print(a + " ," + b);
                for (int i = 3; i <= upto; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                    System.out.print(" ," + c);
                }
                break;

            default:
                System.out.println("Enter a valid choice.");
        }
    }
}
