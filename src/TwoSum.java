import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2,5,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSum2(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int max = 4095 ;
        int[] test = new int[max+1] ;
        for(int i=0 ; i<nums.length ; i++) {
            int temp = target-nums[i];
            int pos = test[temp & max] ;
            if(pos!=0) return new int[] {pos-1 , i } ;
            test[nums[i]&max] = i + 1;
        }
        return null ;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
