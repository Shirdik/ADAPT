// Q10. Create class Movie_Details with field’s mov_Name, lead_actor, lead_actories, and genre add setter and getter method in that class.

// a. After creating this class create class Movie_DetailsList class who will maintain all the objects.

// b. Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()

// c. Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort


import java.util.*;
class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String toString()
    {
        return ("Movie :"+ movieName +"\nActor : "+ actor +"\nActress : "+actress+"\nGerne : "+genre);
    }
}
class movie
{
    ArrayList<MovieDetails> movieDetails= new ArrayList<>();

    public void menu()
    {
            System.out.println("-------------------------------------");
	        System.out.println("----------------MENU-----------------");
	        System.out.println("-------------------------------------");
	        System.out.println("1)addMovie\n2)removeMovies\n3)removeAllMovies\n4)printSortedMovieList");
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your Input :\n");
	        int x= in.nextInt();
	        switch (x) {
            case 1:
                addMovie(new MovieDetails());
                break;
            case 2:
                removeMovies(in.nextLine());
                break;
            case 3:
                //removeAllMovies();
                break;
            case 4:
                printSortedMovieList(movieDetails);
                break;
            }
            in.close();
    }
    public static void sort(ArrayList<MovieDetails> movieDetails,Comparator<MovieDetails> movieDetailsComparator){
        movieDetails.sort(movieDetailsComparator);
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){
        Scanner in = new Scanner(System.in);
        sort(movieDetails,sortAccordingly(in.nextLine()));
        for(MovieDetails x:movieDetails)
        {
            System.out.println(x);
        }
        in.close();
    }
    public void addMovie(MovieDetails movie) {
        movieDetails.add(movie);
    }

    public void removeMovies(String movieName) {
        for(MovieDetails x:movieDetails)
        {
            if(x.getMovieName().equals(movieName))
            {
                movieDetails.remove(x);
                return;
            }
        }
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        movieDetails.removeAll(movies);
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {
        MovieDetails y=new MovieDetails();
        for(MovieDetails x:movieDetails)
        {
            y=x;
            if(x.getMovieName().equals(movieName))
            return x;
        }
        return y;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List <MovieDetails> gerneList= new ArrayList<>();
        for(MovieDetails x:movieDetails)
        {
            String t=x.getGenre();
            if(t.equals(genre))
            gerneList.add(x);
        }
        return gerneList;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        if(sortBy.equals("movieName"))
        return new myCompName();
        else if(sortBy.equals("actor"))
        return new myCompActor();
        else if(sortBy.equals("actress"))
        return new myCompActress();
        else
        return new myCompGenre();
    }

    class myCompName implements Comparator<MovieDetails>{
        public int compare(MovieDetails m1, MovieDetails m2)
        {
            return m1.getMovieName().compareTo(m2.getMovieName());
        }
    }

    class myCompActor implements Comparator<MovieDetails>{
        public int compare(MovieDetails m1, MovieDetails m2)
        {
            return m1.getActor().compareTo(m2.getActor());
        }
    }

    class myCompActress implements Comparator<MovieDetails>{
        public int compare(MovieDetails m1, MovieDetails m2)
        {
            return m1.getActress().compareTo(m2.getActress());
        }
    }

    class myCompGenre implements Comparator<MovieDetails>{
        public int compare(MovieDetails m1, MovieDetails m2)
        {
            return m1.getGenre().compareTo(m2.getGenre());
        }
    }
}
public class Assignment3Q10 {
    public static void main(String[] args) {
        movie a= new movie();
        a.menu();

    }
}