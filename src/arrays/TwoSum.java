package arrays;
/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.

*/

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 9, 11, 15, 7};
        int target = 26;
        //int [] nums = {3, 3}; int target = 6;
        if((twoSum(nums, target) != null)) {
            System.out.println("The index of the elements equal to target = " + target + " is " + twoSum(nums, target)[0]
                    + " and " + twoSum(nums, target)[1]);
            System.out.println("The numbers which sum to the target " + target + " are " + twoSumNumbers(nums, target).get(0) + " and " + twoSumNumbers(nums, target).get(1));
        } else {
            System.out.println("No such elements exists");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Character> set = new HashSet<>();
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    private static List<Integer> twoSumNumbers(int[] nums, int target) {
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            {
                int difference = target - nums[i];
                if (map.containsKey(difference)) {
                    answer.add(difference);
                    answer.add(nums[i]);
                }
                map.put(nums[i], i);
            }

        }
        return answer;
    }

}
