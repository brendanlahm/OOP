import com.opencsv.bean.CsvBindByName;

public class Club {

    // Private Attributes
    @CsvBindByName
    private int id;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private int league;

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLeague() {
        return league;
    }

    // Method for printing a Club
    @Override
    public String toString() {
        return id + " " + name + " (" + league + ")";
    }

}
