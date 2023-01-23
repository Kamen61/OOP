package HW.hw3;

public class Triangle extends Polygon {

    protected Triangle(double side1, double side2, double side3) throws ErrorTriangleNotExist,ErrorSideLessThanZero {
        super(new double[] {side1,side2,side3});
        if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1){
            throw new ErrorTriangleNotExist("Треугольник");
        }
        
    }

    @Override
    double getSquare() {
        double p=this.getPerimetr();
        return Math.sqrt(p*(p-this.side[0])*(p-this.side[1])*(p-this.side[2]));
    }

    @Override
    public String toString() {
        return String.format("\nПериметр %s равен \n%f Площадь равна %f \nСтороны прямоугольника side1 - %f side2 - %f side3 - %f", this.getClass().getSimpleName(),this.getPerimetr(),this.getSquare(),this.side[0],this.side[1],this.side[2]);
    }
}
