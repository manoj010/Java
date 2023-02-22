public class Main {
    public static void main (String[] args) {
        int[] x = new int[3];
        int[] y = {10, 20, 30};
        int[] z = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

//        System.out.println(x[0]);
//        System.out.println(y[0]);

        for (int var: z) {
            System.out.println(var);
        }
    }
}