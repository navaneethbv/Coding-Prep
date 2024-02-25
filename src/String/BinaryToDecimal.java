package String;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1011011001";
        System.out.println("Binary converted to Decimal is "+binary_to_decimal(binary));


        int x = 11 & 9;

        int y = x ^ 3;

        System.out.println( y | 12 );

    }

    public static int binary_to_decimal(String str)
    {
        return Integer.parseInt(str, 2);
    }
}
