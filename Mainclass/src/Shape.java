public class Shape {
    public int width = 10;
    public int height = 20;

    //default constructor
    Shape() {
        width = 10;
        height = 20;
    }

    //parameterized constructor
    Shape(int w, int h) {
        width = w;
        height = h;
    }

    public void area() {
        System.out.println("Area = " + (width * height));
    }
}
