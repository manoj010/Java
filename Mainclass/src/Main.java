public class Main {
    public static void main(String[] args) {
        Shape object = new Shape();
        Shape object2 = new Shape(20,30);

        System.out.println(object.width);

        object.area();

        object2.area();
    }
}