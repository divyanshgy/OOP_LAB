import java.util.Arrays;

public class lab12q1 {

    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid indices. Please provide valid indices within the array bounds.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(integerArray));

        exchangeElements(integerArray, 1, 3);

        System.out.println("Array after exchanging elements: " + Arrays.toString(integerArray));
    }
}
