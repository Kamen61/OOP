package HW.hw4;


public class Program {
    public static void main(String[] args) {
        String[] arr=new String[] {"1","111","2","222","33","5",};
        Integer[] arr2=new Integer[] {9,8,7,6,6,5,4,33,22,111,0};

        ArrayPersonal<String> array=new ArrayPersonal <> (arr);
        ArrayPersonal<Integer> array2=new ArrayPersonal<>(arr2);
        System.out.println(array);
        System.out.println(array2);
        System.out.println();

        // array.add("1234");
        // array2.add(1234);

        // try {
        //     array.remove(1);
        //     array2.remove(1);

        //     array.removElemetn("1234");
        //     array2.removElemetn(1234);

        //     array.min();
        //     array2.min();

        //     array.max();
        //     array2.max();

        //     array.serchElem("1");
        //     array2.serchElem(1);

        //     array.availabilityElem("10");
        //     array2.availabilityElem(10);

        //     array.bubbleSort();
        //     array2.bubbleSort();
            
        //     array.insertionSort();
        //     array2.insertionSort();

        //     array.selectionSort();
        //     array2.selectionSort();

        //     array.indexOF(1);
        //     array2.indexOF(1);

        //     array.replace("5",1);
        //     array2.replace(5,1);

        //     array.lenght();
        //     array2.lenght();

        //     System.out.println(array);
        //     System.out.println(array2);

        // } catch (EmptyException | IndexException e) {
        //     e.printStackTrace();
        // }
        array.bubbleSort();
            array2.bubbleSort();
        System.out.println(array);
        System.out.println(array2);
    }
}
