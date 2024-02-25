import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 1, 0);
        sortNumbers(numbers);
    }

    static List<Integer> sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers, (s1, s2) -> s1.compareTo(s2));
        numbers.forEach(System.out::println);
        return numbers;
    }
}


