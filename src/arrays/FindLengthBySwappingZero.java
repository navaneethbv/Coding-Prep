package arrays;

public class FindLengthBySwappingZero {
    public static void main(String[] args) {
        String value = "110110110111";
        System.out.println("The max length of the substring containing continous 1s by swapping one zero with one is " +findLength(value));
    }

    static int findLength(String value) {
        int left  = 0;
        int curr = 0;
        int ans = 0;

        for(int right  = 0; right < value.length(); right ++) {
            if(value.charAt(right) == '0') {
                curr ++;
            }

            while (curr > 1) {
                if(value.charAt(left) == '0') {
                    curr--;
                }
                left ++;
            }
            ans = Math.max(ans, (right - left + 1));
        }
        return ans;
    }
}


