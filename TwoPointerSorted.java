// TwoPointerSorted.java
import java.util.Arrays;

public class TwoPointerSorted {
    public static int[] twoSum(int[] nums, int target) {
        int[][] paired = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            paired[i][0] = nums[i];
            paired[i][1] = i;
        }

        Arrays.sort(paired, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = paired[left][0] + paired[right][0];
            if (sum == target) {
                return new int[] {paired[left][1], paired[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
