import java.util.*;
import static java.util.Collections.swap;

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
        catalog.add(new Hotel("Havelock", 99, 300));
        catalog.add(new Hotel("Samssara", 42, 200));
        catalog.add(new Hotel("Neil", 50, 250));
        catalog.add(0, new Hotel("Port Blair", 330, 420)); // Add this entry first!
        catalog.add(new Hotel("South Andaman", 111, 150));

        // Print Hotel Catalog
        for (Hotel i : catalog) {
            System.out.println(i);
        }

        System.out.println("\nCatalog size: " + catalog.size()); // Print Catalog size
        System.out.println("\nCatalog Head - " + catalog.get(0)); // Print first element in the catalog
        catalog.get(3).setRooms(199); // Set # rooms for Havlock to 199
        System.out.println("\nHotel at " + catalog.get(3).getLocation() + " now has " + catalog.get(3).getRooms() + " rooms");

        // Integer Sorting w/ Selection Sort
        ArrayList<Hotel> catalogNew = new ArrayList<>();
        for (int i = 0; i < catalog.size(); i++) {
            int minPos = i;
            for (int j = minPos+1; j < catalog.size(); j++) {
                if (catalog.get(j).getRooms() < catalog.get(minPos).getRooms()) {
                    minPos = j;
                }
            }
            if (i != minPos) {swap(catalog, i, minPos);}
        }
        // Print Hotel Catalog
        System.out.println("\nNew sorted Hotel Catalog:");
        for (Hotel i : catalog) {
            System.out.println(i);
        }

        // Integer Sorting w/ Bubble Sort
        int[] nums = {5,2,3,12,49,6,9,21};
        //System.out.println("\nArray:" + Arrays.toString(nums) + "\nLength:\n" + nums.length);
        //BubbleSort bubSort = new BubbleSort();
        //bubSort.bubble(nums);

        // Bubble Sort for ArrayList<Hotel> catalog w/o BubbleSort class
//        int count = 0;
//        while (count < catalog.size() - 1) {
//            int x = 0;
//            int y = 1;
//            while(y < catalog.size()) {
//                if (catalog.get(x).getRooms() > catalog.get(y).getRooms()) {
//                    Hotel temp = catalog.get(x);
//                    catalog.set(x, catalog.get(y));
//                    catalog.set(y, temp);
//                } else count++;
//                x++;
//                y++;
//            }
//            if (count == catalog.size() - 1) { break; }
//            else { count = 0; }
//        }
//        // Print Hotel Catalog
//        for (Hotel i : catalog) {
//            System.out.println(i);
//        }
    }
}
