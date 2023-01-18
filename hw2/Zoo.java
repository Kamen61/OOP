package HW.hw2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> zoo=new ArrayList<Animal>();

    public void addInZoo(Object animal){
        zoo.add((Animal) animal);
    }

    public void printAllInfo(){
        int count=1;
        for (Animal animal : zoo) {
            System.out.println("Животное под номером "+count+" "+animal);
            count++;
        }
    }

    public void delAnimal(){
        Scanner scaner=new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index=scaner.nextInt();
        zoo.remove(index-1);
        System.out.println("Животное под номером "+index+"удален");
    }

    public void printOneInfo(){
        Scanner scaner=new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index=scaner.nextInt();
        System.out.println(zoo.get(index));
    }

    public void sayVoice(){
        Scanner scaner=new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index=scaner.nextInt();
        Animal animal=zoo.get(index);
        animal.sound();
    }

    public void sayVoiceAll(){
        int count=1;
        for (Animal animal : zoo) {
            System.out.println("Животное под номером "+count+" Издал звук ");
            animal.sound();
            count++;
        }
    }
}
