package MustDo;

public class MergedTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        /*for(int i = 0 ; i < mergeTwoSortedArray(nums1, m, nums2, n).length; i++) {
            System.out.print(mergeTwoSortedArray(nums1, m, nums2, n)[i] + " ");
        }*/
        int val = 1020;
        String [] str = String.valueOf(val).split("");
        int count = 0;
        for(int i = str.length - 1; i >= 0; i--) {
            if(str[i].equals("0")){
                count ++;
            } else {
                break;
            }
        }
        System.out.println("Count = "+count);
    }
    private static int[] mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while ( i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[k --] = nums2[j --];
            } else {
                nums1[k --] = nums1[i --];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j --];
        }
        return nums1;
    }
}
