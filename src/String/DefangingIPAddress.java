package String;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String value = "1.1.1.1";
        String val = "abc";
        System.out.println(val.indexOf('b'));
        System.out.println("The defanged IP address is "+defangIPaddr(value));
    }

    public static String defangIPaddr(String address) {
        String[] string = address.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length; i++) {
            if(string[i].equals(".")) {
                sb.append("[.]");
            } else {
                sb.append(string[i]);
            }
        }
        return sb.toString();
    }
}
