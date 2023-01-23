package HW.hw3;

public class ErrorTriangleNotExist extends Exception {
    private String figure;

    ErrorTriangleNotExist(String _figure){
        figure=_figure;
    }

    @Override
    public String toString() {
        return String.format("Нельзя создать %s где две стороны больше либо равны сумме двух других",figure);
    }
}
