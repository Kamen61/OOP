package HW.hw2.Core;

import java.util.ArrayList;

import HW.hw2.Animals.Base.Animal;
import HW.hw2.Animals.Birds.*;
import HW.hw2.Animals.Petss.*;
import HW.hw2.Animals.Wild.*;


public class Zoo {
    private ArrayList<Animal> zoo=new ArrayList<Animal>();

    Tiger tiger=new Tiger("90см", "40кг", "Black", "Рррр", "Сафари", "12.12.2001");
    Stork stork=new Stork("150см", "9кг", "Black", "Кхкхкх", "Сафари", "12.12.2001", "10 метров");
    Cat cat=new Cat("50см", "2кг", "Black", "Мяу", "Орли", "Сиамский", "от Бешенства", "1", "12.12.2010", false);
    Chicken chicken=new Chicken("40см", "4кг", "Black", "Ку-карику", "Поле", "12.12.2001", "0 метров");
    Dog dog=new Dog("70см", "15кг", "Black", "Гав", "Шарик", "Такса", "1", "1", "12.12.2010", false);
    Wolf wolf=new Wolf("80см", "20кг", "Black", "Уууу", "Лес", "12.12.2001", false);
    
    public void addInZoo(Object animal){
        zoo.add((Animal) animal);
        
    }

    public void add(){
        zoo.add(chicken);
        zoo.add(tiger);
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(wolf);
        zoo.add(stork);

    }
    public String printAllInfo(){
        // int count=1;
        // for (Animal animal : zoo) {
        //     System.out.println("Животное под номером "+count+" "+animal);
        //     count++;
        // }
        int count=1;
        String result="";
        for (Animal animal : zoo) {
            result+="Животное под номером "+count+" "+animal.getClass().getSimpleName()+" "+animal+"\n\n";
            count++;
        }
        return result;
    }

    public String delAnimal(int index){
        // Scanner scaner=new Scanner(System.in);
        // System.out.println("Введите номер животного");
        // int index=scaner.nextInt();
        zoo.remove(index-1);
        return "Животное под номером "+index+"удален";
    }

    public Animal printOneInfo(int index){
        // Scanner scaner=new Scanner(System.in);
        // System.out.println("Введите номер животного");
        // int index=scaner.nextInt();
        return  zoo.get(index);
    }

    public String sayVoice(int index){
        // Scanner scaner=new Scanner(System.in);
        // System.out.println("Введите номер животного");
        // int index=scaner.nextInt();
        // Animal animal=zoo.get(index);
        return zoo.get(index).sound();
    }

    public String sayVoiceAll(){
        int count=1;
        String result="";
        for (Animal animal : zoo) {
            result+="Животное под номером "+count+" Издал звук "+animal.sound()+"\n";
            count++;
        }
        return result;
    }
    
}
