package HW.hw4;

public class IndexException extends Exception{
    public IndexException() {}
    public IndexException(String message) {
        super(String.format("Некорректный индекс: %s.", message));
}
}
