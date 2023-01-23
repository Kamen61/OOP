package HW.hw3;


public class main {
    public static void main(String[] args) {

        // В программе имеется массив фигур, с которым можно сделать следующие операции:
        // 1.Добавить новую фигуру
        // 2.Посчитать периметр у всех фигур
        // 3.Посчитать площадь у всех фигур

        // ArrayFigure arr=new ArrayFigure();

        // try {
        //     Rectangle rec = new Rectangle(12, 12);
        //     arr.addFigure(rec);
        //     System.out.println(rec);
        // } catch (ErrorSideLessThanZero e) {
        //     e.printStackTrace();
        // }

        // try {
        //     Circle cir = new Circle(12);
        //     arr.addFigure(cir);
        //     System.out.println(cir);
        // } catch (ErrorSideLessThanZero e) {
        //     e.printStackTrace();
        // }
        
        // try {
        //     Triangle tri = new Triangle(12, 12, 12);
        //     arr.addFigure(tri);
        //     System.out.println(tri);
        // } catch (ErrorTriangleNotExist e) {
        //     e.printStackTrace();
        // } catch (ErrorSideLessThanZero e) {
        //     e.printStackTrace();
        // }

        // try {
        //     Square squ = new Square(12);
        //     arr.addFigure(squ);
        //     System.out.println(squ);
        // } catch (ErrorSideLessThanZero e) {
        //     e.printStackTrace();
        // }
        // System.out.println(arr.calculateAllPerimetr());
        // System.out.println(arr.calculateAllSquare());



        // Создать класс-коллекцию фигур В классе-коллекции реализовать методы6
        // 1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
        // 2. добавления новой фигуры,
        // 3. удаления фигуры,
        // 4. изменения фигуры по ндексу,
        // 5. сортировки по площади, вывод информации о всех фигурах. - не смог реализовать 
        CollectionFigure arr=new CollectionFigure();
        arr.act();




        
    }
}
