package HW.hw3;

import java.util.ArrayList;

public class ArrayFigure{
    private ArrayList<Figure> arr;

    public ArrayFigure(){
        this.arr=new ArrayList<>();
    }
    public String calculateAllPerimetr(){
        String strResult="";
        if (arr.size()!=0){
            double resultPerimetr=0;
            double resultLenght=0;
            for (Figure figure : arr) {
                if (figure instanceof Perimetr){
                    resultPerimetr+=((Polygon) figure).getPerimetr();
                }
                else{
                    resultLenght+=((Circle) figure).getCircleLenght();
                }
            }
            if(resultPerimetr!=0){
            strResult=String.format("Общий периметр многоугольных фигур равен %f ", resultPerimetr);
            }
            if(resultLenght!=0){
                strResult+=String.format("Общее длинна всех окружностей равна %f", resultLenght);
            }
        }
        else{
            strResult="В коллекции нет фигур";
        }
        return strResult;
    }

    public String calculateAllSquare(){
        String strResult="";
        if (arr.size()!=0){
            double result=0;
            for (Figure figure : arr) {
                if (figure instanceof Perimetr){
                    result+=((Polygon) figure).getSquare();
                }
                else{
                    result+=((Circle) figure).getSquare();
                }
            }
            strResult=String.format("Общая площадь фигур в массиве равна %f", result) ;
        }
        else{
            strResult="В коллекции нет фигур";
        }

        return strResult;
    }

    public void addFigure(Figure figure){
        arr.add(figure);
    }
}
