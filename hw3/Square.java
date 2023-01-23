package HW.hw3;

public class Square extends Rectangle{

    public Square(double lenght) throws ErrorSideLessThanZero {
        super(lenght,lenght);
        
    }
    
    @Override
    public String toString() {
        return String.format("\nПериметр квадрата %s равна %f \nПлощадь равна %f \nСтороны квадрата %f ", this.getClass().getSimpleName(),this.getPerimetr(),this.getSquare(),this.side[0]);
    }
}
