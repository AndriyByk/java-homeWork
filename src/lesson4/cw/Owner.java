package lesson4.cw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Owner {
    private String name;
    private byte age;
    private byte experience;
}
