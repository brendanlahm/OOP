import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.opencsv.bean.CsvToBeanBuilder;

public class Bundesliga {

    // Attributes
    public Map<Integer, Club> clubs;
    public List<Game> games;

    // Constructor
    public Bundesliga(Map<Integer, Club> clubs, List<Game> games) {
        this.clubs = clubs;
        this.games = games;
    }

    // Method for importing data
    public static Bundesliga loadFromResource() throws IOException {
        List<Game> games = new CsvToBeanBuilder<Game>(new FileReader("resources/bundesliga_match.csv"))
                .withType(Game.class)
                .withSeparator(';')
                .build()
                .parse();

        List<Club> clubsList = new CsvToBeanBuilder<Club>(new FileReader("resources/bundesliga_club.csv"))
                .withType(Club.class)
                .withIgnoreLeadingWhiteSpace(true) // <== WICHTIG!
                .withSeparator(';')
                .build()
                .parse();

        // Stream
        Map<Integer, Club> clubs = clubsList.stream()
                .collect(Collectors.toMap(
                        Club::getId, // key = club's ID
                        Function.identity(), // value = the club object itself
                        (existing, replacement) -> existing  // keep the first, discard duplicates
                ));

        return new Bundesliga(clubs, games);
    }

}
