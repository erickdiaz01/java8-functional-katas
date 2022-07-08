package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static double execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream().mapToDouble(peli-> peli.getRating()).reduce(5,(anterior,posterior)->Double.compare(anterior,posterior)<0?posterior:anterior);
    }
}
