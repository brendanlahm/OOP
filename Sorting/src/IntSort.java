import java.util.Arrays;

public class IntSort {

    private int[] array;
    private int x;
    private int y;

    static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        System.out.println(Arrays.toString(array));
    }

}
