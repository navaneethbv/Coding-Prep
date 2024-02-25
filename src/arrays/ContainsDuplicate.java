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

*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 4, 3, 2, 1, 6};
       // int nums[] = {1, 4, 3, 2, 8, 6};
        if (containsDuplicate(nums)) {
            System.out.println("The given array contains duplicates");
        } else {
            System.out.println("The given array doesn't contains duplicates");
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
