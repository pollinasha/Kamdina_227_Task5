import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // можно забронировать одну из комнат
        BedAndBreakfast hotel = new BedAndBreakfast();
        Scanner scanner = new Scanner(System.in);

        /* Обратите внимание, здесь для удобства мы используем
        другую конструкцию для оформления цифрового меню.*/

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Забронировать номер");
            System.out.println("2 - Освободить номер");
            System.out.println("3 - Проверить наличие свободных номеров");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();
            /* switch-case конструкция заменяет if-else условия,
            код получается компактнее и быстрее читается */
            switch (command) {
                case 1:
                    // используется публичный метод
                    hotel.book();
                    // break позволяет выйти из условия, иначе - идём дальше
                    break;
                case 2:
                    hotel.free();
                    break;
                case 3:
                    if (hotel.isFull()) {
                        System.out.println("Больше нет мест¯\\_(ツ)_/¯");
                    } else {
                        System.out.println("Есть свободные номера!");
                    }
                    break;
                case 0:
                    System.out.println("Выход");

                    /* Метод exit() останавливает работу JVM, завершая программу.
                    В качестве аргумента принимает число — код ошибки.
                    Если оно не равно 0 — программа завершилась некорректно.*/
                    System.exit(0); // код равен 0, программа была завершена намеренно
                    // break в этом случае не нужен
                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }
}

class BedAndBreakfast { // сделайте класс общедоступным

    private int capacity = 10; // число свободных номеров (10) сохраните в переменную capacity

    private boolean full = false; // сохраните в переменную full значение false - есть номера в наличии

    public void book() { // метод для бронирования комнат
        if (full == false) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity--; // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    public void free() { // метод для освобождения комнат
        if (capacity < 10) { // если свободных комнат меньше 10
            capacity++; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    public boolean isFull() {
        return full;
    }
}