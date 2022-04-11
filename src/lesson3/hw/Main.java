//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//
//      Task1
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//
//      Task2
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

package lesson3.hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // creating of hashSet and treeSet
        HashSet<Person> people = new HashSet<>();
        TreeSet<Person> peopleTreeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {

            int id = i;
            String name = "name" + i;
            String surname = "surname" + i;
            String email = "name" + i + ".surname@" + "abc.com";
            byte age = (byte) Math.round(Math.random() * 50 + 18);
            Gender gender = Math.random() > 0.5 ? Gender.MALE : Gender.FEMALE;
            // skills
            ArrayList<Skill> skills = new ArrayList<>();
            int randomQuantityOfSkills = (int) Math.round(Math.random() * 4) + 1;
            for (int j = 0; j < randomQuantityOfSkills; j++) {
                int ordinalNumOfSkill = (int) Math.round(Math.random() * 4);
                SkillTitle title = SkillTitle.values()[ordinalNumOfSkill];
                int experience = (int) Math.round(Math.random() * 30);
                Skill skill = new Skill(title, experience);
                skills.add(skill);
            }
            // car
            int ordinalNumOfModel = (int) Math.round(Math.random() * 9);
            Model model = Model.values()[ordinalNumOfModel];
            int year = (int) (Math.round(Math.random() * 30) + 1990);
            int power = (int) (Math.round(Math.random() * 300) + 50);
            Car car = new Car(model, year, power);

            Person person = new Person(
                    id,
                    name,
                    surname,
                    email,
                    age,
                    gender,
                    skills,
                    car
            );

            people.add(person);
            peopleTreeSet.add(person);
        }

        // Task 1
        Iterator<Person> personIterator = people.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.gender == Gender.MALE) {
                personIterator.remove();
            }
        }
        people.forEach(System.out::println);

        // Task 2
        peopleTreeSet.forEach(System.out::println);
    }
}
