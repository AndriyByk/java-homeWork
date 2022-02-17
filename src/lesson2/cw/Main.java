//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
//
//
//        Cтворити клас ланцюг наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

package lesson2.cw;

import lesson2.cw.task1.Drum;
import lesson2.cw.task1.Guitar;
import lesson2.cw.task1.Instrument;
import lesson2.cw.task1.Trumpet;
import lesson2.cw.task2.Comics;
import lesson2.cw.task2.Papirus;

public class Main {
    public static void main(String[] args) {
//        Task1
        Instrument[] instruments = new Instrument[3];
        instruments[0]=new Guitar();
        instruments[1]=new Drum();
        instruments[2]=new Trumpet();
        for (Instrument instrument : instruments) {
            instrument.play();
        }
//        Task2
        Papirus papirus = new Comics(10, 75, 150);
        System.out.println(papirus);
    }
}
