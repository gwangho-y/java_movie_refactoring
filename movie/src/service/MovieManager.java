package service;

import model.Movie;
import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> movies;

    public MovieManager(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public Movie getMovie(String name) {
        Movie movie = null;
        for (Movie item : this.movies) {
            if (item.getTitle().equals(name)) {
                movie = item;
            }
        }
        return movie;
    }
}
