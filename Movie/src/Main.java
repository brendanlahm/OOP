import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Review> reviews = new ArrayList<Review>();
        reviews.add(new Review("Netflix", "Drama", 9));
        reviews.add(new Review("Netflix", "Drama", 7));
        reviews.add(new Review("Netflix", "Action", 8));
        reviews.add(new Review("HBO", "Drama", 10));
        reviews.add(new Review("Amazon", "Action", 6));
        reviews.add(new Review("Netflix", "Comedy", 5));

        Catalog catalog = new Catalog(reviews);

        Map<String, Double> results = catalog.getRatingAvg();

        for (String genre : results.keySet()) {
            System.out.println(genre + " → " + results.get(genre));
        }

    }
}
