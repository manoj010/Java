public class Main {
    public static void main(String[] args) {
        int[][] y = {{20, 30, 40},
                    {30, 40, 50},
                    {40, 50, 60}};

        for(int i = 0; i < y.length; i++) {
            for(int j = 0; j < y[i].length; j++) {
                System.out.println("Value of Index: " + i + " " + j + " is " + y[i][j]);
            }
        }
    }
}