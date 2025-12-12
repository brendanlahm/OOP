import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // Construct an ArrayList of movies
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("Netflix", "Drama", 9));
        reviews.add(new Review("Netflix", "Drama", 7));
        reviews.add(new Review("Netflix", "Action", 8));
        reviews.add(new Review("HBO", "Drama", 10));
        reviews.add(new Review("Amazon", "Action", 6));
        reviews.add(new Review("Netflix", "Comedy", 5));
        reviews.add(new Review("Netflix", "Action", 10));

        Catalog catalog = new Catalog(reviews); // Instantiate the movie Catalog
        Map<String, Double> results = catalog.getRatingAvg(); // Avg movie ratings by genre in a Map

//        for (String genre : results.keySet()) {
//            System.out.println(genre + " → " + results.get(genre));
//        }

        // Converted Stream code
        Map<String, Double> stream1 = reviews.stream()
                .filter(review -> "Netflix".equals(review.getProvider()))
                .collect(Collectors.groupingBy(
                        Review::getGenre,
                        Collectors.averagingInt(Review::getRating)
        ));

        System.out.println("\nAverages calculated using Stream\n");
        for (Map.Entry<String, Double> e : stream1.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
