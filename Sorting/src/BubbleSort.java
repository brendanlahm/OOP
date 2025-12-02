import java.util.Arrays;

public class BubbleSort {

    private int[] nums;
    private IntSort intSort;

    public void bubble(int[] nums) {

        int count = 0;
        while (count < nums.length - 1) {
            int x = 0;
            int y = 1;
            while (y < nums.length) {
                if (nums[x] < nums[y]) {
                    //intSort.swap(nums, x, y);
                    int temp = nums[x];
                    nums[x] = nums[y];
                    nums[y] = temp;
                    System.out.println(Arrays.toString(nums));
                } else count++;
                x++;
                y++;
            }
            if (count == nums.length - 1) { break; }
            else { count = 0; }
        }
    }
}
