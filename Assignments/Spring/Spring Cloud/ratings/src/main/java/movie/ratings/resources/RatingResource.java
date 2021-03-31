package movie.ratings.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import movie.ratings.models.Rating;
import movie.ratings.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
    @RequestMapping("/{movieId}")
    public UserRating getMovieRating(@PathVariable("movieId") String movieId){
        ArrayList<Rating> ratings= new ArrayList<>();
        ratings.add(new Rating("Avengers-1",9));
        ratings.add(new Rating("Avengers-2",10));
        ratings.add(new Rating("Avengers-3",7));
        UserRating x=new UserRating();
        x.setUserRatings(ratings);
        return x;
    }
    
}
