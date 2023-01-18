package HW.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Tiger tiger=new Tiger("1", "1", "1", "1", "1", "1");
        Stork stork=new Stork("1", "1", "1", "1", "1", "1", "1");
        Cat cat=new Cat("1", "1", "1", "1", "1", "1", "1", "1", "1", false);
        Chicken chicken=new Chicken("1", "1", "1", "1", "1", "1", "1");
        Dog dog=new Dog("1", "1", "1", "1", "1", "1", "1", "1", "1", false);
        Wolf wolf=new Wolf("1", "1", "1", "1", "1", "1", false);
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

        // System.out.println();
        // pp.printAllInfo();
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
                    System.out.println("Poka");
                    act=false;
                    break;
                default:
                System.out.println("Вы ввели некорректные данные !");
            }

        }
    }
}
// 1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)

// 2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)

// 3.Посмотреть информацию о животном с номером i

// 4.Заставить животное с номером i издать звук

// 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке

// 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук