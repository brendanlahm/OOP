import com.opencsv.bean.CsvBindByName;

public class Club {

    @CsvBindByName
    private int id;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private int league;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLeague() {
        return league;
    }

    @Override
    public String toString() {
        return id + " " + name + " (" + league + ")";
    }

}
