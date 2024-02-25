package arrays;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true


        Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109
*/

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
