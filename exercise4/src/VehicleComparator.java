import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle a, Vehicle b) {
        int makeCompare = a.make.compareTo(b.make);
        if (makeCompare != 0) return makeCompare;

        int modelCompare = a.model.compareTo(b.model);
        if (modelCompare != 0) return modelCompare;

        return Integer.compare(b.year, a.year);  // descending order
    }
}
