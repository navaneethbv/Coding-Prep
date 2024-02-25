package arrays;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 2,3};
        System.out.println("The majority element is "+majorityElement(array));
    }

    public static int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
        /*Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count = 0, majorityElement = 0;
        for(int value: map.keySet()) {
            if(map.get(value) > count) {
                count = map.get(value);
                majorityElement = value;
            }
        }

        return majorityElement;*/
        /*Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();*/
    }
}
