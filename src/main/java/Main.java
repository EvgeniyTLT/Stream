import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println(1)).start();
//        Director director = new Director();
//        String result = director.force((int n)->{
//            for (int i = 0; i < n; i++) {
//                System.out.println("Working...");
//            }
//            return "Success";
//        }, 5);
//        System.out.println(result);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        List<Integer> filtered = filter(numbers, (n) -> n % 2 == 0);

        for (int i : filtered
        ) {
            System.out.println(i);
        }


    }

    public static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers
        ) {
            result.add("Number " + number);
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
