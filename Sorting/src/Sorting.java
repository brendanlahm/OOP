import java.util.Arrays;

public class Sorting {

    private String[] array;
    private int x;
    private int y;

    static void swap(String[] array, int x, int y) {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        System.out.println(Arrays.toString(array));
    }

}
