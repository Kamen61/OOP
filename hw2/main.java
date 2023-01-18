package HW.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Tiger tiger=new Tiger("90см", "40кг", "Black", "Рррр", "Сафари", "12.12.2001");
        Stork stork=new Stork("150см", "9кг", "Black", "Кхкхкх", "Сафари", "12.12.2001", "10 метров");
        Cat cat=new Cat("50см", "2кг", "Black", "Мяу", "Орли", "Сиамский", "от Бешенства", "1", "12.12.2010", false);
        Chicken chicken=new Chicken("40см", "4кг", "Black", "Ку-карику", "Поле", "12.12.2001", "0 метров");
        Dog dog=new Dog("70см", "15кг", "Black", "Гав", "Шарик", "Такса", "1", "1", "12.12.2010", false);
        Wolf wolf=new Wolf("80см", "20кг", "Black", "Уууу", "Лес", "12.12.2001", false);
        ArrayList<Animal> animals=new ArrayList<Animal>();
        animals.add(tiger);
        animals.add(stork);
        animals.add(cat);
        animals.add(dog);
        animals.add(wolf);
        animals.add(chicken);

        Zoo zoo=new Zoo();
        zoo.addInZoo(dog);
        zoo.addInZoo(dog);

        boolean act=true;
        while(act){
            System.out.println("Управление зоопарком : \nДля просмотра всей информации о животных в зоопарке введите 1\n"+
            "Для просмотра информации об определенном животном нажмите 2\nЧтобы засставить всех животных издать звук нажмите 3\n"+
            "Чтобы заставить одно животное издать звук введите 4\nЧтобы убрать животное из зоопарка введите 5\n"+
            "Чтобы добавить животное в зоопарк надмите 6\nВЫХОД 7");
            Scanner scan=new Scanner(System.in);
            int choise=scan.nextInt();
            switch(choise){
                case(1):    
                    zoo.printAllInfo();
                    break;
                case(2):
                    zoo.printAllInfo();
                    zoo.printOneInfo();
                    break;
                case(3):
                    zoo.sayVoiceAll();
                    break;
                case(4):
                    zoo.printAllInfo();
                    zoo.sayVoice();
                    break;
                case(5):
                    zoo.delAnimal();
                    break;
                case(6):
                    int count=1;
                    for (Animal animal : animals) {
                        System.out.println("Номер "+count+animal);
                        count++;
                    }
                    System.out.println("Введите номер животного для добавления в зоопарк");
                    int index=scan.nextInt();
                    if (index<animals.size()+1 && 1<index){
                        zoo.addInZoo(animals.get(index-1));
                    }
                    else{
                        System.out.println("Вы ввели неправильный номер животного");
                    }
                    break;
                case(7):
                    System.out.println("Пока");
                    act=false;
                    break;
                default:
                System.out.println("Вы ввели некорректные данные !");
            }

        }
    }
}
