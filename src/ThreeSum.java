import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(new List[]{threeSum(nums)}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int temp = -nums[i] - nums[j];
                if (map.containsKey(temp)) {
                    List<Integer> internalList = Arrays.asList(nums[i], nums[j], temp);
                    Collections.sort(internalList);
                    if(!res.contains(internalList)) {
                        res.add(internalList);
                    }
                }
                map.put(nums[j], j);
            }
        }
        return res;
    }
}
