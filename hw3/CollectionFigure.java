package HW.hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionFigure implements Comparator<Figure> {
    private ArrayList<Figure> arrayCollection;

    public CollectionFigure(){
        this.arrayCollection=new ArrayList<>();
    }

    public void allInformationOutput(){
        if (arrayCollection.size()==0){
            System.out.println("\nВ коллекции нет фигур.\n");
        }
        else{
            int count=1;
            System.out.println("\nВсе информация о Фигурах : ");
            for (Figure figure : arrayCollection) {
                System.out.println(figure);
            }
            System.out.println();
        }
        
    }

    public Object newFigure(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\nВыберите фигуру для добавления :\n"+
        "1 - Квадрат\n"+
        "2 - Прямоугольник\n"+
        "3 - Треугольник\n"+
        "4 - Круг\n");
        Object addFigure=null;
        int choise=scan.nextInt();
        switch(choise){
            case(1):
                System.out.println("Введите сторону квадрата :");
                Double said=scan.nextDouble();
                try {
                    Square square=new Square(said);
                    addFigure=square;
                    System.out.println("\nКвадрат добавлен в коллекцию!\n");
                } catch (ErrorSideLessThanZero e) {
                    e.printStackTrace();
                }
                break;
            case(2):
                System.out.println("Введите длину прямоугольника :");
                Double lenght=scan.nextDouble();
                System.out.println("Введите ширину прямоугольника :");
                Double weight=scan.nextDouble();
                try {
                    Rectangle rectangle=new Rectangle(lenght, weight);
                    addFigure=rectangle;
                    System.out.println("\nПрямоугольник добавлен в коллекцию!\n");
                } catch (ErrorSideLessThanZero e) {
                    e.printStackTrace();
                }
                break;
            case(3):
                System.out.println("Введите 1 сторону треугольника :");
                Double side1=scan.nextDouble();
                System.out.println("Введите 2 сторону треугольника :");
                Double side2=scan.nextDouble();
                System.out.println("Введите 3 сторону треугольника :");
                Double side3=scan.nextDouble();
                try {
                    Triangle triangle=new Triangle(side1, side2, side3);
                    addFigure=triangle;
                    System.out.println("\nТреугольник добавлен в коллекцию!\n");
                } catch (ErrorTriangleNotExist | ErrorSideLessThanZero e) {
                    e.printStackTrace();
                }
                break;
            case(4):
                System.out.println("Введите радиус круга :");
                Double r=scan.nextDouble();
                try {
                    Circle circle=new Circle(r);
                    addFigure=circle;
                    System.out.println("\nКруг добавлен в коллекцию!\n");
                } catch (ErrorSideLessThanZero e) {
                    e.printStackTrace();
                }
                break;

        }
        return addFigure;
    }

    public void addFigureInCollection(Object figure){
        arrayCollection.add((Figure) figure);
    }

    public void addFigureByIndex(int index,Object figure){
        arrayCollection.set(index, (Figure) figure);
    }


    public void removeFigure(){
        System.out.println("\nВведите номер фигуры по порядку, которую вы ходите удалить");
        int count=1;
        for (Figure figure : arrayCollection) {
            System.out.println(String.format("Номер - %d ",count )+figure.getClass().getSimpleName());
            count++;
        }
        Scanner scan=new Scanner(System.in);
        int index=scan.nextInt()-1;
        if (index>-1 && index<=arrayCollection.size()){
            arrayCollection.remove(index);
        }
        else{
            System.out.println("\nВы ввели некорректный номер фигуры\n");
        }
    }

    public void replaceFigure(){
        System.out.println("\nВведите номер фигуры по порядку, которую вы ходите поменять");
        allInformationOutput();
        Scanner scan=new Scanner(System.in);
        int index=scan.nextInt()-1;
        if (index>-1 && index<=arrayCollection.size()){
            Object figur= newFigure();
            addFigureByIndex(index,figur);
        }
        else{
            System.out.println("\nВы ввели некорректный номер фигуры\n");
        }
    }


    public void sortBySquare(){
        arrayCollection.sort(null);
        System.out.println("\nКоллекция отсортирована\n ");
    }

    @Override
    public int compare(Figure o1, Figure o2) {
        return (int)((o1.getSquare())-o2.getSquare());
    }

    public void act(){
        boolean act=true;
        System.out.println("Добро пожаловать !\n");
        while (act) {
            System.out.println(
            "Введите цифру для перехода по меню :\n"+
            "1 - Вывод информации о всех периметах, площадях и длиннах окружности всех фигур\n"+
            "2 - Добавления новой фигуры\n"+
            "3 - Удаления фигуры\n"+
            "4 - Изменения фигуры по ндексу\n"+
            "5 - Cортировки по площади, вывод информации о всех фигурах\n"+
            "6 - Выход\n");
            Scanner scan=new Scanner(System.in);
            int index=scan.nextInt();
            switch(index){
                case(1):
                    allInformationOutput();
                    break;
                case(2):
                    Object temp=newFigure();
                    if(temp!=null)
                        addFigureInCollection(temp);
                    break;
                case(3):
                    removeFigure();
                    break;
                case(4):
                    replaceFigure();
                    break;
                case(5):
                    sortBySquare();
                    break;
                case(6):
                    act=false;

            }
        }
    }

}