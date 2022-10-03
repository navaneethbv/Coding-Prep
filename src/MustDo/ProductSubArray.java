package MustDo;

public class ProductSubArray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum product sub array value is "+maxProduct(array));
    }

    private static int maxProduct(int[] nums) {
        int max_so_far = nums[0], min_so_far = nums[0], result = max_so_far;
        for(int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int temp_max = Math.max(value, Math.max(value * max_so_far, value * min_so_far));
            min_so_far = Math.min(value, Math.min(value * max_so_far, value * min_so_far));
            max_so_far = temp_max;
            result = Math.max(max_so_far, result);
        }
        return result;
    }
}
