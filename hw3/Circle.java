package HW.hw3;

public class Circle extends Figure implements CircleLenght{

    double radius;
    public Circle(double radius) throws ErrorSideLessThanZero{
        this.radius=radius;
        if (radius<=0){
            throw new ErrorSideLessThanZero();
        }
    }
    @Override
    public double getCircleLenght() {
        return 2*Math.PI*radius ;
    }

    @Override
    double getSquare() {
        return Math.PI*Math.pow(this.radius, 2) ;
    }

    @Override
    public String toString() {

        return String.format("\nДлинна окружности %s равна %f \nПлощадь равна %f \nРадиус круга %f\n", this.getClass().getSimpleName(),this.getCircleLenght(),this.getSquare(),this.radius);
          
}
}
