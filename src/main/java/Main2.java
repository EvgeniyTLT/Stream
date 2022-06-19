import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));


//        long count = users.stream()
//                .filter((user -> user.getAge()>30))
//                .count(); // считает количество оставшихся элементов

//        boolean count = users.stream()
//                .allMatch(user -> user.getAge() >18); // проверяте на соответствие

//        boolean count = users.stream()
//                .anyMatch(user -> user.getAge() >18); // если есть хоть одно true, возвращает true

//        boolean count = users.stream()
//                .noneMatch(user -> user.getAge() <= 18); // есть все false, вернет true

//        Optional<User> oldest = users.stream()
////                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
////                .limit(3)
////                .forEach((user) -> System.out.println(user));
////                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
////                .filter(user -> user.getAge() < 40)
////                .limit(3)
////                .map(user -> user.getName())
////                .forEach(System.out::println);
//                .filter(user -> user.getAge() < 5)
//                .max(Comparator.comparingInt(User::getAge));
//
//        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

//        int[] array = {3, 1, 3, 5, 14}; // варианты создания стримов
//        Arrays.stream(array). ....
//        Stream.of(5, 3,5,4524); .....


        users.stream()
                .filter(user1 -> user1.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

    }
}
