import java.util.ArrayList;

public class BubbleSortList {

    private ArrayList<Hotel> list;

    public ArrayList<Hotel> bubbleList(ArrayList<Hotel> list) {
        int count = 0;
        while (count < list.size() - 1) {
            int x = 0;
            int y = 1;
            while(y < list.size()) {
                if (list.get(x).getRooms() > list.get(y).getRooms()) {
                    Hotel temp = list.get(x);
                    list.set(x, list.get(y));
                    list.set(y, temp);
                } else count++;
                x++;
                y++;
            }
            if (count == list.size() - 1) { break; }
            else { count = 0; }
        }
        return list;
    }
}
