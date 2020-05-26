import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SearchTargetPositions {

    public static void main(String[] args) {
        int[] n = {2, 2, 2};
        System.out.println(Arrays.toString(searchRange(n, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int ind = 0;
        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                resMap.put(ind, i);
                ind++;
            }
        }
        if (!resMap.isEmpty()) {
            res[0] = resMap.get(0);
            res[1] = resMap.get(resMap.size() - 1);
        }
        return res;
    }
}
