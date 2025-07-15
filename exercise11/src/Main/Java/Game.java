import com.opencsv.bean.CsvBindByName;

public class Game {

    @CsvBindByName
    private int id;
    @CsvBindByName
    private int matchDay;
    @CsvBindByName
    private String date;
    @CsvBindByName
    private String time;
    @CsvBindByName
    private int clubIdHome;
    @CsvBindByName
    private int clubIdGuest;
    @CsvBindByName
    private int goalsHome;
    @CsvBindByName
    private int goalsGuest;

    public int getId() { return id; }
    public int getMatchDay() { return matchDay; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public int getClubIdHome() { return clubIdHome; }
    public int getClubIdGuest() { return clubIdGuest; }
    public int getGoalsHome() { return goalsHome; }
    public int getGoalsGuest() { return goalsGuest; }

    @Override
    public String toString() {
        return id + " " + matchDay + " " + date + " " + time + " " +
                clubIdHome + " vs " + clubIdGuest + " " +
                goalsHome + ":" + goalsGuest;
    }

}
