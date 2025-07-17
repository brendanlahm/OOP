import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            Bundesliga bundesliga = Bundesliga.loadFromResource();
            System.out.println("Clubs loaded: " + bundesliga.clubs.size());
            System.out.println("Games loaded: " + bundesliga.games.size());

            // Print all club names using stream
            bundesliga.clubs.values()
                    .stream()
                    .map(Club::getName)
                    .forEach(System.out::println);

            // Print all club IDs, names & leagues using lambda (clubs is a Map w/ values!)
            bundesliga.clubs.values().forEach(club -> System.out.println(club.getId() + ", " + club.getName() + ", " + club.getLeague()));

            // Print all games names using lambda (games is a List w/o values!)
            //bundesliga.games.forEach(game -> System.out.println(game.getClubIdHome() + " vs " + game.getClubIdGuest()));;

        } catch (IOException e) {
            System.err.println("Failed to load Bundesliga data: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
