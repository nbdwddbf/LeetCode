/**
 * @Auther: dabuff
 * @Date: 19-2-20 14:21
 * @Description:
 */
public class Num_35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 6, 10};
        int target = 10;
        Solution_35 solution = new Solution_35();
        int result = solution.searchInsert_2(nums, target);
        System.out.println(result);
    }
}

class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0])
            return 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target)
                return i;
            else if (i < nums.length - 1) {
                if (target > nums[i] && target < nums[i + 1])
                    return i + 1;
            } else if (target > nums[i])
                return i + 1;
        }
        return -1;
    }

    public int searchInsert_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)

                return i;

        }

        return nums.length;
    }

    //二分法
    public int searchInsert_2(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid;
            } else if (nums[mid] < target){
                low = mid + 1;
            }else
                return mid;
        }

        return low;
    }
}
