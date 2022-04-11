package lesson3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    Model model;
    int year;
    int power;
}
