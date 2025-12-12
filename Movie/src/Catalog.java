import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {

    // Private attributes
    private List<Review> reviews;

    // Constructor
    public Catalog(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Map<String, Double> getRatingAvg() {

        Map<String, Double> result = new HashMap<>();

        // Temporary structures to compute averages
        Map<String, Integer> ratingSum = new HashMap<>();
        Map<String, Integer> ratingCount = new HashMap<>();

        for (Review review : reviews) {

            // Filter: Provider must be "Netflix"
            if ("Netflix".equals(review.getProvider())) {

                String genre = review.getGenre();
                int rating = review.getRating();

                // Sum ratings per genre
                if (!ratingSum.containsKey(genre)) {
                    ratingSum.put(genre, rating);
                    ratingCount.put(genre, 1);
                } else {
                    ratingSum.put(genre, ratingSum.get(genre) + rating);
                    ratingCount.put(genre, ratingCount.get(genre) + 1);
                }
            }
        }

        // Compute averages
        for (String genre : ratingSum.keySet()) {
            double avg = (double) ratingSum.get(genre) / ratingCount.get(genre);
            result.put(genre, avg);
        }
        return result;
    }

}
