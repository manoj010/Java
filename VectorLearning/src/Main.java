import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> age = new Vector<>();
        Vector<Integer> age2 = new Vector<>(5);

        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);

        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);

        System.out.println(age.capacity());

        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);
        age.add(50);

        System.out.println(age2.capacity());
    }
}