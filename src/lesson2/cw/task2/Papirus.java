package lesson2.cw.task2;

public class Papirus {
    int ageOfMaterial;

    public Papirus() {
    }

    public Papirus(int ageOfMaterial) {
        this.ageOfMaterial = ageOfMaterial;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "ageOfMaterial=" + ageOfMaterial +
                '}';
    }
}
