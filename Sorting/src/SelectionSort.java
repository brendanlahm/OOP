import java.util.ArrayList;
import static java.util.Collections.swap;

public class SelectionSort {

    private ArrayList<Hotel> list;

    public ArrayList<Hotel> select(ArrayList<Hotel> list) {

        for (int i = 0; i < list.size(); i++) {
            int minPos = i;
            for (int j = minPos+1; j < list.size(); j++) {
                if (list.get(j).getRooms() < list.get(minPos).getRooms()) {
                    minPos = j;
                }
            }
            if (i != minPos) {swap(list, i, minPos);}
        }
        return list;
    }
}
