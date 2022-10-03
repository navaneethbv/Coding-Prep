package MustDo;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sub array value is "+maxSubArray(array));
    }

    private static int maxSubArray(int[] array) {
        int currentSubArraySum = array[0], maxSubArraySum = array[0];
        for(int i = 1; i < array.length; i++) {
            int value = array[i];
            currentSubArraySum = Math.max(value, currentSubArraySum + value);
            maxSubArraySum = Math.max(maxSubArraySum, currentSubArraySum);
        }
        return maxSubArraySum;
    }
}
