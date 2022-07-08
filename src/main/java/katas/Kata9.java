package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream().map(listaPelis->listaPelis.getVideos()).flatMap(pelis->pelis.stream()).map(peli->ImmutableMap.of("ID",peli.getId(),"Title",peli.getTitle(),"middleInteresting Moment",peli.getInterestingMoments().stream().filter(interestingMoment -> interestingMoment.getType()=="Middle").map(interestingMoment -> interestingMoment.getTime()),"Boxart",peli.getBoxarts().stream().min((boxArt, boxArt2) -> Integer.compare((boxArt.getHeight()*boxArt.getWidth()),(boxArt.getHeight())* boxArt2.getHeight())))).collect(Collectors.toList());
                //ImmutableList.of(ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl"));
    }
}
