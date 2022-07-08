package util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DataUtil {
    /*
     * [
     * {
     * "id": 70111470,
     * "title": "Die Hard",
     * "boxarts": [
     * { width: 150, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard150.jpg" },
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard200.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 4.0,
     * "interestingMoments": [
     * { type: "End", time:213432 },
     * { type: "Start", time: 64534 },
     * { type: "Middle", time: 323133}
     * ]
     * },
     * {
     * "id": 654356453,
     * "title": "Bad Boys",
     * "boxarts": [
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg" },
     * { width: 140, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg" }
     * 
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 5.0,
     * "interestingMoments": [
     * { type: "End", time:54654754 },
     * { type: "Start", time: 43524243 },
     * { type: "Middle", time: 6575665}
     * ]
     * },
     * {
     * "id": 65432445,
     * "title": "The Chamber",
     * "boxarts": [
     * { width: 130, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg" },
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 4.0,
     * "interestingMoments": [
     * { type: "End", time:132423 },
     * { type: "Start", time: 54637425 },
     * { type: "Middle", time: 3452343}
     * ]
     * },
     * {
     * "id": 675465,
     * "title": "Fracture",
     * "boxarts": [
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture200.jpg" },
     * { width: 120, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture120.jpg" },
     * { width: 300, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture300.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 5.0,
     * "interestingMoments": [
     * { type: "End", time:45632456 },
     * { type: "Start", time: 234534 },
     * { type: "Middle", time: 3453434}
     * ]
     * }
     * ]
     */
    public static List<Movie> getMovies() {
        List<Movie> result = new ArrayList<Movie>();
        result.add(new Movie(70111470,
                "Die Hard",
                ImmutableList.of(
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"),
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/DieHard200.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                4.0,
                new ArrayList<Bookmark>(),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));
        result.add(new Movie(654356453,
                "Bad Boys",
                ImmutableList.of(
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"),
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                5.0,
                ImmutableList.of(new Bookmark(432534, new Date())),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));
        result.add(new Movie(65432445,
                "The Chamber",
                ImmutableList.of(
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"),
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                4.0,
                new ArrayList<Bookmark>(),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));
        result.add(new Movie(675465,
                "Fracture",
                ImmutableList.of(
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"),
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"),
                        new BoxArt(300, 200, "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                5.0,
                ImmutableList.of(new Bookmark(432534, new Date())),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));
        /*result.add(new Movie(548792,
                "Mr.Nobody",
                ImmutableList.of(
                        new BoxArt(300, 250, "https://m.media-amazon.com/images/I/51w+jqAUwZL._AC_.jpg"),
                        new BoxArt(150, 200,
                                "https://agoradeeducacion.com/nassau/wp-content/uploads/2018/10/Mr-Nobody.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111471",
                4.9,
                ImmutableList.of(new Bookmark(130387, new Date())),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));
        result.add(new Movie(7816682,
                "Inception",
                ImmutableList.of(
                        new BoxArt(150, 400, "https://play-lh.googleusercontent.com/buKf27Hxendp3tLNpNtP3E-amP0o4yYV-SGKyS2u-Y3GdGRTyfNCIT5WAVs2OudOz6so5K1jtYdAUKI9nw8"),
                        new BoxArt(150, 260,
                                "https://pics.filmaffinity.com/Origen-131981581-large.jpg")),
                "http://api.netflix.com/catalog/titles/movies/70111472",
                4.7,
                ImmutableList.of(new Bookmark(478120, new Date())),
                ImmutableList.of(
                        new InterestingMoment("End", new Date()),
                        new InterestingMoment("Middle", new Date()),
                        new InterestingMoment("Start", new Date()))));*/
        return result;
    }

    /*
     * [
     * {
     * name: "New Releases",
     * videos: [
     * {
     * "id": 70111470,
     * "title": "Die Hard",
     * "boxarts": [
     * { width: 150, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard150.jpg" },
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard200.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 4.0,
     * "interestingMoments": [
     * { type: "End", time:213432 },
     * { type: "Start", time: 64534 },
     * { type: "Middle", time: 323133}
     * ]
     * },
     * {
     * "id": 654356453,
     * "title": "Bad Boys",
     * "boxarts": [
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg" },
     * { width: 140, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg" }
     * 
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 5.0,
     * "interestingMoments": [
     * { type: "End", time:54654754 },
     * { type: "Start", time: 43524243 },
     * { type: "Middle", time: 6575665}
     * ]
     * }
     * ]
     * },
     * {
     * name: "Instant Queue",
     * videos: [
     * {
     * "id": 65432445,
     * "title": "The Chamber",
     * "boxarts": [
     * { width: 130, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg" },
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 4.0,
     * "interestingMoments": [
     * { type: "End", time:132423 },
     * { type: "Start", time: 54637425 },
     * { type: "Middle", time: 3452343}
     * ]
     * },
     * {
     * "id": 675465,
     * "title": "Fracture",
     * "boxarts": [
     * { width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture200.jpg" },
     * { width: 120, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture120.jpg" },
     * { width: 300, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture300.jpg" }
     * ],
     * "url": "http://api.netflix.com/catalog/titles/movies/70111470",
     * "rating": 5.0,
     * "interestingMoments": [
     * { type: "End", time:45632456 },
     * { type: "Start", time: 234534 },
     * { type: "Middle", time: 3453434}
     * ]
     * }
     * ]
     * }
     * ]
     */
    public static List<MovieList> getMovieLists() {
        List<MovieList> result = new ArrayList<MovieList>();
        result.add(new MovieList("New Releases", getMovies().subList(0, 2)));
        result.add(new MovieList("Dramas", getMovies().subList(2, 4)));
        /*result.add(new MovieList("Futuro",getMovies().subList(4,5)));
        result.add(new MovieList("Ciencia ficcion",getMovies().subList(5,5)));*/
        return result;
    }

    /*
     * [
     * {id: 470, time: 23432},
     * {id: 453, time: 234324},
     * {id: 445, time: 987834}
     * ]
     */
    public static List<Bookmark> getBookMarks() {
        List<Bookmark> result = new ArrayList<>();
        result.add(new Bookmark(470, new Date()));
        result.add(new Bookmark(453, new Date()));
        result.add(new Bookmark(445, new Date()));
        return result;
    }

    /*
     * [
     * {
     * "id": 5434364,
     * "name": "New Releases"
     * },
     * {
     * "id": 65456475,
     * name: "Thrillers"
     * }
     * ]
     */
    public static List<Map> getLists() {
        List<Map> result = new ArrayList<>();
        result.add(ImmutableMap.of("id", 5434364, "name", "New Releases"));
        result.add(ImmutableMap.of("id", 65456475, "name", "Thrillers"));
        return result;
    }

    /*
     * [
     * {
     * "listId": 5434364,
     * "id": 65432445,
     * "title": "The Chamber"
     * },
     * {
     * "listId": 5434364,
     * "id": 675465,
     * "title": "Fracture"
     * },
     * {
     * "listId": 65456475,
     * "id": 70111470,
     * "title": "Die Hard"
     * },
     * {
     * "listId": 65456475,
     * "id": 654356453,
     * "title": "Bad Boys"
     * }
     * ]
     */
    public static List<Map> getVideos() {
        List<Map> result = new ArrayList<Map>();
        result.add(ImmutableMap.of("listId", 5434364, "id", 65432445, "title", "The Chamber"));
        result.add(ImmutableMap.of("listId", 5434364, "id", 675465, "title", "Fracture"));
        result.add(ImmutableMap.of("listId", 65456475, "id", 70111470, "title", "Die Hard"));
        result.add(ImmutableMap.of("listId", 65456475, "id", 654356453, "title", "Bad Boys"));
        return result;
    }

    /*
     * [
     * { videoId: 65432445, width: 130, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg" },
     * { videoId: 65432445, width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg" },
     * { videoId: 675465, width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture200.jpg" },
     * { videoId: 675465, width: 120, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture120.jpg" },
     * { videoId: 675465, width: 300, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/Fracture300.jpg" },
     * { videoId: 70111470, width: 150, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard150.jpg" },
     * { videoId: 70111470, width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/DieHard200.jpg" },
     * { videoId: 654356453, width: 200, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg" },
     * { videoId: 654356453, width: 140, height:200,
     * url:"http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg" }
     * ]
     */
    public static List<Map> getBoxArts() {
        List<Map> result = new ArrayList<>();
        result.add(ImmutableMap.of("videoId", 65432445, "width", 130, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg"));
        result.add(ImmutableMap.of("videoId", 65432445, "width", 200, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg"));
        result.add(ImmutableMap.of("videoId", 675465, "width", 200, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"));
        result.add(ImmutableMap.of("videoId", 675465, "width", 120, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/Fracture120.jpg"));
        result.add(ImmutableMap.of("videoId", 675465, "width", 300, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg"));
        result.add(ImmutableMap.of("videoId", 70111470, "width", 150, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"));
        result.add(ImmutableMap.of("videoId", 70111470, "width", 200, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/DieHard200.jpg"));
        result.add(ImmutableMap.of("videoId", 654356453, "width", 200, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"));
        result.add(ImmutableMap.of("videoId", 654356453, "width", 140, "height", 200, "url",
                "http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg"));
        return result;
    }

    /*
     * [
     * { videoId: 65432445, time: 32432 },
     * { videoId: 675465, time: 3534543 },
     * { videoId: 70111470, time: 645243 },
     * { videoId: 654356453, time: 984934 }
     * ]
     */
    public static List<Map> getBookmarkList() {
        List<Map> result = new ArrayList<>();
        result.add(ImmutableMap.of("videoId", 65432445, "time", 32432));
        result.add(ImmutableMap.of("videoId", 675465, "time", 3534543));
        result.add(ImmutableMap.of("videoId", 70111470, "time", 645243));
        result.add(ImmutableMap.of("videoId", 654356453, "time", 984934));
        return result;
    }
}
