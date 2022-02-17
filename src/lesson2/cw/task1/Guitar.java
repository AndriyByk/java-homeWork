package lesson2.cw.task1;

public class Guitar implements Instrument {
    byte numberOfStrings = 5;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " with " + numberOfStrings + " strings is playing.");
    }
}
