public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2,5,6};
        System.out.println(searchTargetIndex(nums, 6));
    }

    public static int searchTargetIndex(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        while (r >= l) {
            int medIndex = (r + l) / 2;
            if (nums[medIndex] == target) {
                return medIndex;
            } else if (target > nums[medIndex]) {
                if (target <= nums[r]) {
                    l = medIndex+1;
                } else {
                    r--;
                }
            } else if (target < nums[medIndex]) {
                if (target >= nums[l]) {
                    r = medIndex-1;
                } else {
                    l++;
                }
            }
        }

        return -1;
    }
}
