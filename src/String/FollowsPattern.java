package String;

/*You are given a string s of x and y.
You need to verify whether the string follows the pattern xnyn.
That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.*/

public class FollowsPattern {
    public static void main(String[] args) {
         String value = "xyxxyyxxyyxyxxxyyy";
        //String value = "xxyy";
        if(followPattern(value) == 0) {
            System.out.println("The given pattern is not valid");
        } else {
            System.out.println("The given pattern is valid");
        }
    }

    static int followPattern(String value) {
        if(value.length() % 2 != 0) {
            return 0;
        }
        if(value.charAt(0)=='y') {
            return 0;
        }
        String[] array = value.split("");
        int countX = 1, countY = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i].equals("x")) {
                if(array[i].equals(array[i - 1])) {
                    countX++;
                } else {
                    if(countX != countY) {
                        return 0;
                    }
                    countX = countY = 0;
                    countX++;
                }
            } else {
                if(i != array.length - 1) {
                    countY++;
                } else {
                    countY++;
                    return countX == countY ? 1 : 0;
                }
            }
        }
        return 1;
    }
}
