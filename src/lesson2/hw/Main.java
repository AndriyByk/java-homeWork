//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!
//
//
//        а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
package lesson2.hw;

import lesson2.hw.task1.Laptop;
import lesson2.hw.task1.PC;
import lesson2.hw.task1.Ultrabook;
import lesson2.hw.task1.Workstation;
import lesson2.hw.task2.Book;
import lesson2.hw.task2.Magazine;
import lesson2.hw.task2.Printable;

public class Main {
    public static void main(String[] args) {

        //        Task1
        PC pc = new Workstation();
        Laptop laptop = new Ultrabook();

        //        Task2
        Printable[] printable = new Printable[5];
        for (int i = 0; i < printable.length; i++) {
            if (i % 2 == 0) {
                printable[i] = new Magazine();
            } else {
                printable[i] = new Book();
            }
        }
        for (Printable printable1 : printable) {
            System.out.println(printable1);
        }
    }
}
