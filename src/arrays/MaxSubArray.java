package arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The Maximum SubArray sum is " +maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int value = nums[i];
            currentSubArray = Math.max(value, currentSubArray + value);
            maxSubArray = Math.max(currentSubArray, maxSubArray);
        }
        return maxSubArray;
    }
}
