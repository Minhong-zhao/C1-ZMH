import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = {4, 0, 1, 0, 2, 3};
        int k = 3;
        System.out.println(findkthnum(nums, k));
    }

    private static int findkthnum(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }
}