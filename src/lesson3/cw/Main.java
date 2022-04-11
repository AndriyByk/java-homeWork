// Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В зооклубі створити методи, та застосувати їх
// 1) додати учасника в клуб;
// 2) додати тваринку до учасника клубу.
// 3) видалити тваринку з власника.
// 4) видалити учасника клубу.
// 5) видалити конкретну тваринку з усіх власників.
// 6) вивести на екран зооклуб.
// Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
// Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

package lesson3.cw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        // 1

        zooClub.addMember("Taras");
        zooClub.addMember("Petro");
        zooClub.addPet("Taras", "Pushock");
        zooClub.addPet("Petro", "Persik");
        zooClub.addPet("Petro", "Kokosik");
        zooClub.addPet("Petro", "Persik");
        zooClub.addPet("Petro", "Persik");

        zooClub.showClub();
        zooClub.removePet("Petro","Kokosik");
        zooClub.showClub();
        zooClub.removeMember("Taras");
        zooClub.showClub();
        zooClub.removePet("Persik");
        zooClub.showClub();

    }
}
