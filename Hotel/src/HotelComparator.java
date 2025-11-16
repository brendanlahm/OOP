import java.util.Comparator;

public class HotelComparator implements Comparator<Hotel> {

    @Override
    public int compare(Hotel a, Hotel b) {
        return Integer.compare(a.getPrice(), b.getPrice());
    }
}
