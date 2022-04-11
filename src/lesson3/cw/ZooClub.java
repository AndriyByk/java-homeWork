package lesson3.cw;

import lombok.Data;

import java.util.*;

@Data
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    // 1
    public void addMember (String nameOfPerson) {
        club.put(new Person(nameOfPerson), new ArrayList<>());
    }

    // 2
    public void addPet (String nameOfPerson, String nameOfPet) {
        for (Person person : club.keySet()) {
            if (person.getName().equals(nameOfPerson)) {
                List<Pet> pets = club.get(person);
                pets.add(new Pet(nameOfPet));
                club.replace(person, pets);
                break;
            }
        }
    }

    // 3
    public void removePet (String nameOfPerson, String nameOfPet) {
        for (Person person : club.keySet()) {
            if (person.getName().equals(nameOfPerson)) {
                List<Pet> pets = club.get(person);
                pets.removeIf(pet -> pet.getName().equals(nameOfPet));
                club.replace(person, pets);
                break;
            }
        }
    }

    // 4
    public void removeMember (String nameOfPerson) {
        Set<Person> people = club.keySet();
        people.removeIf(person -> person.getName().equals(nameOfPerson));
    }

    // 5
    public void removePet (String nameOfPet) {
        for (Person person : club.keySet()) {
            List<Pet> pets = club.get(person);
            pets.removeIf(pet -> pet.getName().equals(nameOfPet));
            club.replace(person, pets);
        }
    }

    // 6
    public void showClub () {
        club.forEach((person, pets) -> {
            if (pets.size() > 0) {
                System.out.println(person.getName() + " has such pets:");
                for (Pet pet : pets) {
                    System.out.print(pet.getName() + " ");
                }
                System.out.println();
            } else {
                System.out.println(person.getName() + " has not any pets.");
            }
        });
    }
}
