package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
    DataSource: DataUtil.getMovies()
    Output: List of Integers
*/
public class Kata2 {
    public static List<List<Integer>> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream().filter(peli->peli.getRating()==5.0).map(peliMayorA5->List.of(peliMayorA5.getId())).collect(Collectors.toList());
    }
}
