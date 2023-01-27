package HW.hw4;

import java.util.Arrays;
import java.util.List;

public class ArrayPersonal<U extends Comparable<U>> {
    // INIT_SIZE - размер массива
    // array - массив
    // pointer - количество элементов в массиве
    private final int INIT_SIZE = 16;
    private Object[] array;
    private int pointer = 0; 

    // 1. Конструктор без параметров – конструктор по умолчанию, проводяющий базовую иницаилизацию массива
    public ArrayPersonal(){
        this.array=new Object[INIT_SIZE];
    }

    // 2. Конструктор с параметром T[] – конструктор, который проводит инициализацию и 
    // заполняет массив данными, пришедшими из параметра
    public ArrayPersonal( U[] arr){
        this.array=new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i]=arr[i];
        }
        this.pointer=arr.length;
    }


    // 1. Вставка в массив
    public void add (U elem){
        if(pointer == array.length)
            resize(array.length+INIT_SIZE); // увеличу на 16, если достигли границ
        array[pointer] = elem;
        pointer++;
    }

    // 2. Удаление элемента по индексу
    public void remove(int index) throws EmptyException,IndexException{
        checkIndex(index, false);
        for (int i = index; i<pointer; i++) 
            this.array[i] = this.array[i+1];
        this.array[pointer] = null;
        pointer--;
    }

    // 3. Удаление всех элементов с заданным значением
    public void removElemetn(U elem)throws EmptyException,IndexException{
        if (pointer == 0) {
            throw new EmptyException("Массив пуст.");
        }
        for (int i = 0; i < pointer; i++) {
            if (array[i]==elem){
                checkIndex(Arrays.asList(array).indexOf(elem), false);
                remove(Arrays.asList(array).indexOf(elem));
            }
        }
    }

    // 4. Поиск минимума
    public U min() throws EmptyException{
        if (pointer == 0) {
            throw new EmptyException("Массив пуст.");
        }
        U minimum = (U) array[0];
        for (int i = 1; i < pointer; i++) {
            U temp = (U) array[i];
            if (minimum.compareTo(temp) > 0) {
                minimum = temp;
            }
        }
        return minimum;
        
    }

    // 5. Поиск максимума
    public U max() throws EmptyException{
        if (pointer == 0) {
            throw new EmptyException("Массив пуст.");
        }
        U maximum = (U) array[0];
        for (int i = 1; i < pointer; i++) {
            U temp = (U) array[i];
            if (maximum.compareTo(temp) < 0) {
                maximum = temp;
            }
        }
        return maximum;
        
    }

    // 6. Поиск суммы элементов массива
    // public U sum(U[] arr){
    //     U sum;
    //     for (U u : arr) {
    //         sum+=u;
    //     }
    //     return sum;
    // }

    // 7. Поиск произведения элементов массива
    // public U pow(U[] arr){
    //     U pow;
    //     for (U u : arr) {
    //         pow*=u;
    //     }
    //     return pow;
    // }

    // 8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public int serchElem(U elem){
        if (Arrays.asList(array).indexOf(elem)>pointer)
            return -1;
        else{
            return Arrays.asList(array).indexOf(elem);
        }
            
    }

    // 9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
    public boolean availabilityElem(U elem){
        boolean result=false;
        for (Object u :  array) {
            if (u==elem)
                return result=true;
        }
        return result;
    }

    // 10. Пузырьковая сортировка
    public void bubbleSort() {
        for (int i = 0; i < pointer; i++) {
            for (int j = 1; j < pointer - i; j++) {
                U next = (U) array[j];
                U previous = (U) array[j - 1];
                if (next.compareTo(previous) < 0) {
                    U temp = (U) array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
    // 11. Сортировка простыми вставками
    public void insertionSort() {
        for (int i = 1; i < pointer; i++) {
            int j = i;
            while (j > 0) {
                U jth = (U) array[j];
                U jMinusOneth = (U) array[j - 1];
                if (jMinusOneth.compareTo(jth) < 0) {
                    break;
                }
                U temp = (U) array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }
    // 12. Сортировка простым выбором
    public void selectionSort() {
        for (int i = 0; i < pointer - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < pointer; j++) {
                if (((U) array[j]).compareTo((U) array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            U temp = (U) array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    // 13. Получение элемента массива по индексу
    public U indexOF(int index)throws IndexException{
        checkIndex(index, false);
        return (U) array[index];
    }

    // 14. Задание значения элементу массива с заданным индексом
    public void replace(U elem, int index)throws IndexException{
        checkIndex(index, false);
        array[index]=elem;
    }

    // 16. Длинна массива
    public int lenght(){
        return pointer;
    }


    // Увеличение размера массива
    public  void resize(int length){
        Object[] newArray = new Object[length];
        System.arraycopy(array, 0, newArray, 0, pointer);
        this.array=newArray;
    }


    // 15. Печать массива на экран
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < pointer - 1; i++) {
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.append(array[pointer - 1]);
        sb.append(']');
        return sb.toString();

    }

    // Исключения
    private void checkIndex(int index, boolean isForAdding) throws IndexException {
        if (index < 0) {
            throw new IndexException("Индекс меньше нуля");
        }
        if (isForAdding) {
            if (index > pointer) {
                throw new IndexException("Индекс для добавления больше чем последний имеющийся индекс плюс один");
            }
        } else {
            if (index > pointer - 1) {
                throw new IndexException("Индекс больше индекса последнего элемента");
            }
        }
    }




}   
// 1. Вставка в массив
// 2. Удаление элемента по индексу
// 3. Удаление всех элементов с заданным значением
// 4. Поиск минимума
// 5. Поиск максимума
// 6. Поиск суммы элементов массива
// 7. Поиск произведения элементов массива
// 8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
// 9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
// 10. Пузырьковая сортировка
// 11. Сортировка простыми вставками
// 12. Сортировка простым выбором
// 13. Получение элемента массива по индексу
// 14. Задание значения элементу массива с заданным индексом
// 15. Печать массива на экран
// 16. Длинна массива
