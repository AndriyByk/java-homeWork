package lesson4.cw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String model;
    private int power;
    private Owner owner;
    private int price;
    private int year;
}
