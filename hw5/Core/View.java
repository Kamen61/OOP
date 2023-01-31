package HW.hw5.Core;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    // Ввод строки с консоли
    public String getValue(String title) {
        System.out.println("Введите пример для расчета : ");
        return in.nextLine();
    }

    // Вывод результата в консоль
    public void print(String result) {
        System.out.printf("Результат = %s", result);
    }

    // Вывод ошибки в консоль
    public void printError(){
        System.out.println("Вы ввели недопустимые символы.\nВ данной программе можно использовать символы 1234567890+-()*/.,");
    }
}
