//Створити колекцію Юзерів
//
//      Task 1
//        - відсортувати  за  віком (зростання , а потім окремо спадання)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//      Task 2
//        створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .
//        -- відфільтрувати слова довжиною менше 4 символів
//
//      Task 3
//        - Створити масив з 20 числами.
//        - за допомогою способу sorted відсортувати масив.
//        -- за допомогою filter отримати числа кратні 3
//        -- за допомогою filter отримати числа кратні 10
//        -- перебрати (проітерувати) масив за допомогою foreach()
//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

package lesson4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Taras", 25));
        users.add(new User("Tamara", 30));
        users.add(new User("Sofiyka", 19));
        users.add(new User("Lana", 34));
        users.add(new User("Ostap", 68));
        users.add(new User("Panteleymon", 12));
        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(users);
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(users);
        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(users);
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(users);
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        String text = "Cтворити ArrayList зі словами на 15-20 елементів. " +
                "Відсортувати його за алфавітом. " +
                "Відфільтрувати слова довжиною менше 4 символів";
        List<String> list = Arrays.asList(text.split(" "));
        List<String> collect = list.stream()
                .sorted(String::compareTo)
                .filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        int [] ar1 = Arrays.stream(array).sorted().toArray();
        int [] ar2 = Arrays.stream(array).filter(value -> value % 3 == 0).toArray();
        int [] ar3 = Arrays.stream(array).filter(value -> value % 10 == 0).toArray();
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
        int [] ar4 = Arrays.stream(array).map(value -> value * 3).toArray();
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));
        System.out.println(Arrays.toString(ar4));
    }
}
