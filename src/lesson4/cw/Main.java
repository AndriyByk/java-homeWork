//Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//        Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//        Створити не менше 7 та не більше 20 машинок.

//        Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//        На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
//        
//        Для початку вкладіть всі наші створені автомобілі в масив cars.
//        Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//
//        Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//        Все через stream API

package lesson4.cw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 180, new Owner("Taras", (byte) 25, (byte) 7), 20000, 2015));
        cars.add(new Car("Audi", 110, new Owner("Ostap", (byte) 30, (byte) 8), 19000, 2010));
        cars.add(new Car("Opel", 99, new Owner("Petro", (byte) 29, (byte) 4), 22000, 2018));
        cars.add(new Car("Lada", 69, new Owner("Maria", (byte) 45, (byte) 15), 40000, 2021));
        cars.add(new Car("Suzuki", 100, new Owner("Stanislava", (byte) 55, (byte) 25), 10000, 2005));
        cars.add(new Car("KIA", 95, new Owner("Andriy", (byte) 60, (byte) 29), 7000, 2005));
        cars.add(new Car("Toyota", 180, new Owner("Yurko", (byte) 34, (byte) 9), 5900, 2005));
        cars.add(new Car("Mazda", 120, new Owner("Bogdan", (byte) 44, (byte) 12), 14000, 2021));
        cars.add(new Car("Mini", 140, new Owner("Yulia", (byte) 26, (byte) 2), 20000, 2020));
        cars.add(new Car("Dodge", 270, new Owner("Tamara", (byte) 19, (byte) 1), 50000, 2022));

        List<Car> cars1 = cars.stream()
                .skip(cars.size() / 2)
                .map(car -> {
                    car.setPower((int) Math.round(car.getPower() * 1.1));
                    car.setOwner(new Owner("Aaa", (byte) 30, (byte) 10));
                    return car;
                }).collect(Collectors.toList());

        ArrayList<Integer> prices = new ArrayList<>();

        List<Car> cars2 = cars.stream()
                .map(car -> {
                    Owner owner = car.getOwner();
                    int age = car.getOwner().getAge();
                    int experience = car.getOwner().getExperience();
                    prices.add(car.getPrice());
                    if (age > 25 && experience < 5) {
                        owner.setExperience((byte) (experience + 1));
                    }
                    return car;
                }).collect(Collectors.toList());

        int whole_price = 0;
        for (Integer price : prices) {
            whole_price += price;
        }

        System.out.println(cars1);
        System.out.println(cars2);
        System.out.println(whole_price);
    }


}
