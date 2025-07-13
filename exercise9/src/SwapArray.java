public class SwapArray {

    public String[] swapIndices(String[] seq, int x, int y) {

        String xVal = seq[x];
        String yVal = seq[y];
        seq[x] = yVal;
        seq[y] = xVal;

        return seq;
    }

}
