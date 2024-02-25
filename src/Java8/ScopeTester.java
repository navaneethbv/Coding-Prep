package Java8;

public class ScopeTester {
    final static String salutation = "Hello! ";

    public static void main(String args[]) {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Nav");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
