package lesson2.cw.task1;

public class Drum implements Instrument {
    int size = 10;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " with size of " + size + " is playing.");
    }
}
