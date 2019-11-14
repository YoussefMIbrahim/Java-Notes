package MovieDatabase;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    static final String db = "jdbc:sqLite:movie_watchlist.sqLite";

    private static Database database;

    public static void main(String[] args) {
        database = new Database(db);
        //addNewMovies();
        displayAllMovies();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
    }

    private static void displayAllMovies() {

        List<Movie> movies = database.getAllMovies();
        for (Movie movie: movies){
            System.out.println(movie.name);
        }
    }

    private static void addNewMovies() {

        do{

            String movieName = stringInput("Please enter movie name");
            Movie movie = new Movie(movieName);
            database.addNewMovie(movie);

        }while (yesNoInput("Add another movie to wish list database?"));

    }

    private static void checkIfWatchedAndRate(){

        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        for (Movie movie: unwatchedMovies){
            boolean hasWatched = yesNoInput("Have you watched "+ movie.name + "?");
            if (hasWatched){
                int stars = intInput("What is your rating for "+ movie.name + " out of 5 stars?");
                movie.watched = true;
                movie.stars = stars;
                database.updateMovie(movie);

            }
        }
    }
    private static void deleteWatchedMovies(){
        System.out.println("Here are the movies you have watched.");

        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        for (Movie movie: watchedMovies){
            boolean delete = yesNoInput("Delete " + movie.name + "?");
            if (delete){
                database.deleteMovie(movie);
            }
        }
    }
}
