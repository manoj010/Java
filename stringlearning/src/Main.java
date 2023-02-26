public class Main {
    public static void main(String[] args) {

        //immutable
        String str1 = "Hello";
//        String str2 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));

        //mutable
        StringBuffer name = new StringBuffer("Manoj");
        name.append(" Ale");
        System.out.println(name);
    }
}