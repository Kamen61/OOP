package HW.hw2.Core;

import java.util.Scanner;

public class View {
    Scanner sc=new Scanner(System.in);
    public void printInfo(String str){
        System.out.println(str);
    }

    public <T> void printAnimal(T a){
        System.out.println(a);
    }

    public int printMenuAndScanInfo(){
        System.out.println("Управление зоопарком : \nДля просмотра всей информации о животных в зоопарке введите 1\n"+
                "Для просмотра информации об определенном животном нажмите 2\nЧтобы засставить всех животных издать звук нажмите 3\n"+
                "Чтобы заставить одно животное издать звук введите 4\nЧтобы убрать животное из зоопарка введите 5\n"+
                "ВЫХОД 6 ");
        return sc.nextInt();
    }

    public int writeIndex(){
        System.out.println("Введите индекс животного : ");
        return sc.nextInt();
    }

    public boolean goodbye(){
        System.out.println("Пока");
        return false;
    }

    public void error(){
        System.out.println("Вы ввели некорректные данные !");

    }

}
