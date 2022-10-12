package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubString {
    public static void main(String[] args) {
        String value = "inengineeringng";
        int subStringLength = 2;
        System.out.println("The max occuring substring of length "+subStringLength +" is "+maxOccuringSubString(value, subStringLength));
    }

    static String maxOccuringSubString(String value, int subStringLength) {

        if( value == null || value.length() == 0) return "";
        if(value.length() < subStringLength) return value;

        Map<String, Integer> map = new HashMap<String, Integer>();

        System.out.println(value.substring(0, 0 + 2)); //

        for(int i = 0; i < value.length() - subStringLength + 1; i++) {
            String subStringValue  = value.substring(i, i + subStringLength);
            if(!map.containsKey(subStringValue)) {
                map.put(subStringValue, 1);
            } else {
                map.put(subStringValue, map.get(subStringValue) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        return Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();


        // ng = 3, in = 3 --> maxValue = 3, iterate - > hashmap, compare maxValue with Key = ng, ne and in
    }

}
