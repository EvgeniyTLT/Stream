import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        List<Integer> filtered = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .map((Function<Integer, String>) integer -> "Number: " + integer)


        for (String i : mapped
        ) {
            System.out.println(i);
        }


    }

    public static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers
        ) {
            result.add("Number: " + number);
        }
        return result;
    }

    public static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
