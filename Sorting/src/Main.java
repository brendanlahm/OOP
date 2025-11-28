import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array Sorting
        String[] array = {"Metallic", "Silver", "Gold", "Bronze"};
        System.out.println(Arrays.toString(array));
        ArraySort arraySort = new ArraySort();
        arraySort.swap(array, 1, 3);
        System.out.println(array[2]); //Print third element of the array

        // Create ArrayList of Hotels
        ArrayList<Hotel> catalog = new ArrayList<>();
        catalog.add(new Hotel("Samssara", 42, 200));
        catalog.add(new Hotel("Neil", 50, 250));
        catalog.add(new Hotel("Havelock", 99, 300));
        catalog.add(0, new Hotel("Port Blair", 330, 420)); // Add this entry first!

        // Print Hotel Catalog
        for (Hotel i : catalog) {
            System.out.println(i);
        }

        System.out.println("\nCatalog size: " + catalog.size()); // Print Catalog size
        System.out.println("\nCatalog Head - " + catalog.get(0)); // Print first element in the catalog

        // Integer Sorting w/ Bubble Sort
//        int[] nums = {5,2,3,12,6,9,21};
//        System.out.println("\n" + Arrays.toString(nums) + "\nLength:" + nums.length);
//        IntSort intSort = new IntSort();
//        int count = 0;
//        while (count < nums.length - 1) {
//            int x = 0;
//            int y = 1;
//            while (y < nums.length) {
//                if (nums[x] < nums[y]) {
//                    intSort.swap(nums, x, y);
//                } else count++;
//                x++;
//                y++;
//            }
//            if (count == nums.length - 1) { break; }
//            else { count = 0; }
//        }

        // UNUSED
        // Instantiate BubbleSort
        //BubbleSort<Hotel> bubSort = new BubbleSort(new HotelComparator());
        //Node<Hotel> list1 = bubSort.sort(list);
        //System.out.println("\nSort the list by Price");
        //bubSort.printList(list1);

    }
}
