package HW.hw3;


public class ErrorSideLessThanZero extends Exception {
    
    @Override
    public String toString() {
        return "Нельзя построить фигуру со сторонами 0 и меньше !";
    }
}
