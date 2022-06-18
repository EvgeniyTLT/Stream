import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<User> sorted = users.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .collect(Collectors.toList());

        for (User user: sorted
             ) {
            System.out.println(user);
        }
    }
}
