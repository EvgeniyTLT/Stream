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

        for (int i:filter(numbers, 7)
             ) {
            System.out.println(i);
        }





    }

    public static List<Integer> filter(List<Integer> list, int a) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (new Predicate() {
                @Override
                public boolean test(int a) {
                    if (i % a == 0) {
                        return true;
                    } else return false;
                }
            }.test(5) == true) {
                result.add(i);
            }
        }
        return result;
    }
}
