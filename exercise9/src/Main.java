import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SwapArray swapArray = new SwapArray();
        String[] newSeq = swapArray.swapIndices(new String[] {"A","B","C","D","E"}, 0, 3);
        System.out.println(Arrays.toString(newSeq));

    }

}
