import java.io.IOException;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        try {
            Bundesliga bundesliga = Bundesliga.loadFromResource(); // Load Data
            System.out.println("Clubs loaded: " + bundesliga.clubs.size());
            System.out.println("Games loaded: " + bundesliga.games.size() + "\n");

            // Print all club names using stream
//            bundesliga.clubs.values() // .values() works for Maps only?
//                    .stream()
//                    .map(Club::getName)
//                    .forEach(System.out::println);

            // Print all club IDs, names & leagues using Lambda (clubs is a Map w/ values!)
            bundesliga.clubs.values().forEach(club -> System.out.println(club.getId() + ". " + club.getName() + ", League: " + club.getLeague()));

            // Print all games names using Lambda (games is a List w/o values!)
            //bundesliga.games.forEach(game -> System.out.println(game.getClubIdHome() + " vs " + game.getClubIdGuest()));;

            // Print average goals in a match using stream
            double averageGoals = bundesliga.games.stream()
                    .filter(game ->  // Filter to require first league (Avg. 3.219 goals per match)
                            bundesliga.clubs.get(game.getClubIdHome()).getLeague() == 1 &&
                                    bundesliga.clubs.get(game.getClubIdGuest()).getLeague() == 1
                    )
                    .mapToInt(game -> game.getGoalsHome() + game.getGoalsGuest()) // Avg. goals/match in all leagues = 3.022 goals
                    .average()
                    .orElse(0.0);
            System.out.println("\nAverage goals per match in first League: " + averageGoals);


        } catch (IOException e) {
            System.err.println("Failed to load Bundesliga data: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
