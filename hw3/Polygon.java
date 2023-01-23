package HW.hw3;

public abstract class Polygon extends Figure implements Perimetr{
    protected double[] side;

    protected Polygon(double[] side) throws ErrorSideLessThanZero{
        this.side=side;
        if (side[0]<=0 || side[1]<=0){
            throw new ErrorSideLessThanZero();
        }
    }

    public double getPerimetr(){
        double result=0;
        for (double s : this.side) {
            result+=s;
        }
        return result;
    }



    
}
