public class Review {

    // Private Attributes
    private String provider;
    private String genre;
    private int rating;

    // Constructor
    public Review(String provider, String genre, int rating) {
        this.provider = provider;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters
    public String getProvider() {
        return provider;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    // Method for printing
    @Override
    public String toString() {
        return provider + " | " + genre + " | Rating: " + rating;
    }

}
