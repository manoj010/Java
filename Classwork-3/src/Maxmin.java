public class Maxmin {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 2, 12, 24, -1};
        int max = 0;
        int min = 0;
        int arrlen = arr.length;
        for (int i = 0; i <= arrlen-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }
}
