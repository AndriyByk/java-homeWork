package lesson2.cw.task2;

public class Comics extends Book {
    int numberOfPictures;

    public Comics() {
    }

    public Comics(int ageOfMaterial) {
        super(ageOfMaterial);
    }

    public Comics(int ageOfMaterial, int numberOfPages) {
        super(ageOfMaterial, numberOfPages);
    }

    public Comics(int ageOfMaterial, int numberOfPages, int numberOfPictures) {
        super(ageOfMaterial, numberOfPages);
        this.numberOfPictures = numberOfPictures;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "numberOfPictures=" + numberOfPictures +
                '}'+ super.toString();
    }
}
