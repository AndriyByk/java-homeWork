package lesson2.cw.task2;

public class Book extends Papirus {
    int numberOfPages;

    public Book() {
    }

    public Book(int ageOfMaterial) {
        super(ageOfMaterial);
    }

    public Book(int ageOfMaterial, int numberOfPages) {
        super(ageOfMaterial);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                '}' + super.toString();
    }
}
