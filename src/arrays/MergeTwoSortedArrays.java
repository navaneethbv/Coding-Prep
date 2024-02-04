package arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7, 9, 11, 13, 15};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("The merged array is");
        for(int num: mergedArray(array1, array2)) {
            System.out.print(num + " ");
        }
    }

    static int[] mergedArray(int[] array1, int[] array2) {
        int[] mergedNewArray = new int[array1.length + array2.length];
        int left = 0, right = 0, mergedIndex = 0;

        while (left < array1.length && right < array2.length) {
            if (array1[left] <= array2[right]) {
                mergedNewArray[mergedIndex++] = array1[left++];
            } else {
                mergedNewArray[mergedIndex++] = array2[right++];
            }
        }

        // Copy any remaining elements from array1
        while (left < array1.length) {
            mergedNewArray[mergedIndex++] = array1[left++];
        }

        // Copy any remaining elements from array2
        while (right < array2.length) {
            mergedNewArray[mergedIndex++] = array2[right++];
        }

        return mergedNewArray;
    }

}
