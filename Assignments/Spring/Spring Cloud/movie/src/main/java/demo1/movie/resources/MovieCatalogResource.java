package demo1.movie.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import demo1.movie.models.CatalogItem;
import demo1.movie.models.Rating;
import demo1.movie.models.UserRating;
import demo1.movie.models.Movie;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private WebClient.Builder builder;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public List<CatalogItem> getCatalog(@PathVariable("movieId") String movieId){
     
    // RestTemplate rest = new RestTemplate();

    //     ArrayList<Rating> ratings=new ArrayList<>();
    //     ratings.add(new Rating("1234",4));
    //     ratings.add(new Rating("1234",4));
    //     ratings.add(new Rating("1234",4));

    //     return ratings.stream().map((rating)->{
    //         Movie movie=rest.getForObject("http://localhost:8083/movie/foo",Movie.class);
    //         new CatalogItem(movie.getName(),"desc",rating.getRating());
    //     }).collect(Collectors.toList());

        // Rating rating= new Rating("1234",4);
        // Movie movie=rest.getForObject("http://localhost:8083/movie/foo",Movie.class);
        // CatalogItem item= new CatalogItem(movie.getName(),"desc",rating.getRating());
        // return item;

        UserRating ratings= restTemplate.getForObject("http://localhost:8082/rating/"+movieId,UserRating.class);



        return ratings.getUserRatings().stream().map((rating)->
        {
            Movie movie=builder.build()
            .get()
            .uri("http://localhost:8083/movie/avengers")
            .retrieve()
            .bodyToMono(Movie.class)
            .block();

           return new CatalogItem(rating.getMovieId(),"desc",rating.getRating()); 
        }).collect(Collectors.toList());
        
    }
    @RequestMapping("/status")
    public String status(){
        return "Hello World!!";
    }
}
