package basics;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SingleLineComment {
    public static void main(String[] args) {
        float a = 3.25F; float b = 2.5F;
        float result = a / b;
        System.out.println(result);
        DecimalFormat df = new DecimalFormat("#.###");
        //df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(result));
    }
}
