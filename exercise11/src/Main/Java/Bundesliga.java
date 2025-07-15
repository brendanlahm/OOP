import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.opencsv.bean.CsvToBeanBuilder;

public class Bundesliga {

    public Map<Integer, Club> clubs;
    public List<Game> games;

    // Constructor
    public Bundesliga(Map<Integer, Club> clubs, List<Game> games) {
        this.clubs = clubs;
        this.games = games;
    }

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

        Map<Integer, Club> clubs = clubsList.stream()
                .collect(Collectors.toMap(
                        Club::getId,
                        Function.identity(),
                        (existing, replacement) -> existing  // keep the first, discard duplicates
                ));

        return new Bundesliga(clubs, games);
    }

}
