import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9, 5, 9, 5, 5, 5};
        System.out.println("输入:" + Arrays.toString(nums));
        System.out.println(findmainnum(nums));
        int[] mem = {3, 2};
        System.out.println("输入:" + Arrays.toString(mem));
        System.out.println(findmainnum(mem));
    }

    private static int findmainnum(int[] nums) {
        int ans = -1;
        int ax = nums[0];
        for (int num : nums) {
            ax = Math.max(ax, num);
        }
        int[] visit = new int[ax + 1];
        for (int i = 0; i < nums.length; i++) {
            visit[nums[i]]++;
        }
        for (int v : visit) {
            if (v > nums.length / 2) {
                ans = v;
                break;
            }
        }
        return ans;
    }
}