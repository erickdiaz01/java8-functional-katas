package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<ImmutableMap> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream().map(listaPelis->listaPelis.getVideos()).flatMap(peli->peli.stream()).map(peli->ImmutableMap.of("ID",peli.getId(),"title", peli.getTitle(),"BoxArt",peli.getBoxarts().stream().filter(boxArt -> boxArt.getWidth()==150).filter(boxArt -> boxArt.getHeight()==200))).collect(Collectors.toList());
                //("id", 5, "title", "Bad Boys", "boxart", new BoxArt(150, 200, "url")));
    }
}
