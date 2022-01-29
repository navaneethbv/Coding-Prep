package basics;

public class LCM {

    public static void main(String[] args) {
        int a = 7, b = 3;
        System.out.println("The LCM of "+ a + " and "+ b +" is "+LCM(a, b));
    }

    public static int LCM(int a, int b){
        int i;
        for(i = 1; i < a*b; i++) {
            if(i % a == 0 && i % b == 0) {
                break;
            }
        }
        return i;
    }
}
