package lesson2.cw.task2;

public class Magazine extends Book {
    int magazineOutputFrequency;

    public Magazine() {
    }

    public Magazine(int magazineOutputFrequency) {
        this.magazineOutputFrequency = magazineOutputFrequency;
    }

    public Magazine(int ageOfMaterial, int magazineOutputFrequency) {
        super(ageOfMaterial);
        this.magazineOutputFrequency = magazineOutputFrequency;
    }

    public Magazine(int ageOfMaterial, int numberOfPages, int magazineOutputFrequency) {
        super(ageOfMaterial, numberOfPages);
        this.magazineOutputFrequency = magazineOutputFrequency;
    }
}
