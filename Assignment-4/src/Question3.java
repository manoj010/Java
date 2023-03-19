public class Question3 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int length = nums.length;

        int[] ans = new int[length];

        for(int i = 0; i <= length - 1; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.print("Nums Array = [ ");
        for(int j = 0; j <= length - 1; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println("]");

        System.out.print("Ans Array = [ ");
        for(int k = 0; k <= length - 1; k++) {
            System.out.print(ans[k] + " ");
        }
        System.out.print("]");

    }
}