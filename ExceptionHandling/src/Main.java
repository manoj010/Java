import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Divider: ");
            int divider = input.nextInt();
            if(divider == 0) {
                throw new Exception("Number cannot be divided by zero.");
            }
            System.out.println("Value: ");
            int value = input.nextInt();
            int result = value / divider;
            System.out.println("Result => " + result);
        } catch (Exception e) {
            System.out.println("Exception => " + e);
        } finally {
            System.out.println("Finally.");
        }
    }
}