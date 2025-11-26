import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class HotelIterator implements Iterator<Hotel> {

    private List<Hotel> list;
    private int index = 0;
    private int maxRooms;  // dynamic parameter

    // Constructor w/ dynamic parameter maxRooms
    public HotelIterator(List<Hotel> list, int maxRooms) {
        this.list = list;
        this.maxRooms = maxRooms;

        // Move index to first valid element
        moveToNextValid();
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Hotel next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Hotel current = list.get(index);
        index++;

        // Move index to next valid hotel
        moveToNextValid();

        return current;
    }

    private void moveToNextValid() {
        while (index < list.size() && list.get(index).getRooms() > maxRooms) {
            index++;
        }
    }
}

