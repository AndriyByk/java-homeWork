package lesson3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor

public class Person implements Comparable<Person> {
    int id;
    String name;
    String surname;
    String email;
    byte age;
    Gender gender;
    ArrayList<Skill> skills;
    Car car;


    @Override
    public int compareTo(Person o) {
        return this.skills.size() - o.skills.size();
    }
}
