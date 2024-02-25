package arrays;

public class SortedArrayTwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 11, 15, 17};
        int target = 21;
        //int [] nums = {3, 3}; int target = 6;
        if(twoSum(nums, target)) {
            System.out.println("A unique pair of elements exists that sum to target");
        } else
            System.out.println("No such elements exists");
    }

    private static boolean twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            if(nums[left] + nums[right] > target) {
                right --;
            } else if (nums[left] + nums[right] < target) {
                left ++;
            } else {
                return true;
            }
        }
        return false;
    }


}
