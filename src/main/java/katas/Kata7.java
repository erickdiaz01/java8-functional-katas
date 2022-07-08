package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream().map(listaPelis->listaPelis.getVideos()).flatMap(pelis->pelis.stream()).map(peli->ImmutableMap.of("ID",peli.getId(),"Title",peli.getTitle(),"Boxart",peli.getBoxarts().stream().min((boxArt, boxArt2) -> Integer.compare((boxArt.getHeight()*boxArt.getWidth()),(boxArt.getHeight())* boxArt2.getHeight())))).collect(Collectors.toList());
                //.map(peli->peli.getBoxarts()).flatMap(boxArts -> boxArts.stream()).reduce((boxArt, boxArt2) ->
                //(boxArt.getHeight()*boxArt.getWidth())<(boxArt2.getHeight()*boxArt2.getWidth())?boxArt:boxArt2).stream().map(boxArt -> ImmutableMap.of("ID",boxArt.get))
              //  ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url");
    }
}
