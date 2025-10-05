// TwoPassHashMap.java
import java.util.HashMap;

public class TwoPassHashMap {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // First pass: build map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Second pass: search
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && map.get(need) != i) {
                return new int[] {i, map.get(need)};
            }
        }

        return new int[0];
    }
}
