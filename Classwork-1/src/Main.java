import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person obj = new Person();

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = Input.nextLine();

        System.out.println("Enter your age: ");
        int age = Input.nextInt();

        Person obj2 = new Person(name, age);
        obj.introduce();
        obj2.introduce();
    }
}