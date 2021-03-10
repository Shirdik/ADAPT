package movie.ratings.models;

import java.util.ArrayList;

public class UserRating {
    private ArrayList<Rating> userRatings;

    public UserRating() {
    }
    public UserRating(ArrayList<Rating> userRatings) {
        this.userRatings = userRatings;
    }
    public ArrayList<Rating> getUserRatings() {
        return userRatings;
    }
    public void setUserRatings(ArrayList<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
