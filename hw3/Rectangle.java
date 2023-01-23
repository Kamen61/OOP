package HW.hw3;


public class Rectangle extends Polygon {

    public Rectangle(double lenght, double width) throws ErrorSideLessThanZero{
        super(new double[]{lenght,width,lenght,width});
    }

    public double getSquare(){
        return this.side[0]*this.side[1];
    }

    @Override
    public String toString() {
        return String.format("\nПериметр %s равен \n%f Площадь равна %f \nСтороны прямоугольника lenght - %f width - %f", this.getClass().getSimpleName(),this.getPerimetr(),this.getSquare(),this.side[0],this.side[1]);
    }
}
