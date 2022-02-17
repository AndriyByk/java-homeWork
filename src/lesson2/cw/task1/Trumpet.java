package lesson2.cw.task1;

public class Trumpet implements Instrument {
    int diameter = 15;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " with diameter of " + diameter + " is playing.");
    }
}
