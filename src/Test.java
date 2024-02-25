import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 1, 0);
        sortNumbers(numbers);
    }

    static List<Integer> sortNumbers(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);

        return numbers;
    }
}


