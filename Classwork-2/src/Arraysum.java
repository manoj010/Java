public class Arraysum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int i = 0;
        int sum =0;
        while(i < 5) {
            System.out.print(arr[i] + " ");
            sum = arr[i] + sum;
            i++;
        }
        System.out.println("\nSum = " + sum);
    }
}
