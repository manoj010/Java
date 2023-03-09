public class Person {
    public Person() {
        String name = "Pandu";
        int age = 22;
    }
    Person(String x, int y) {
        String name = x;
        int age = y;
    }
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old");
    }
}
