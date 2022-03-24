package Stream.Workshop1;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SongMethods {

  public List<Song> filterBy(List<Song> list, Predicate<Song> predicate){
    List<Song> resultList = new ArrayList<>();
    resultList = list.stream()
        .filter(predicate)
        .collect(Collectors.toList());
    return resultList;
  }
  public Song maxSongTime(List<Song> list, Comparator<Song> comparator){
    Song maxLastSong = list.stream()
        .max(comparator)
        .get();
    System.out.println(maxLastSong);
    return maxLastSong;
  }
  public Double maxSongByReduce(List<Song> list){
    //reduce - if X > Y RETURN X AS MAX OTHERWISE RETURN Y
    Double maxLastSongByReduce = list.stream()
        .map(Song::getLastOfSong)
        .reduce((X,Y) -> X>Y?X:Y).get();
    System.out.println(maxLastSongByReduce);
    return maxLastSongByReduce;
  }
  public List<Song> orderedBy(List<Song> list, Comparator<Song> comparator){
    List<Song> resultList = new ArrayList<>();

    resultList = list.stream()
        .sorted(comparator)
        .collect(Collectors.toList());

    resultList.stream()
        .forEach(System.out::println);
    return resultList;
  }
  public double sumTimeAllSongs(List<Song> list){
    double sumOfTime = list
        .stream()
        .map(Song::getLastOfSong)
        .reduce(0.0,Double::sum);
    System.out.println(sumOfTime);
    return sumOfTime;
  }
  public List<Song> eliminateTheSameArtist(List<Song> list){
    List<Song> resultList;
    resultList = list.stream().distinct().collect(Collectors.toList());
    resultList.forEach(System.out::println);
    return resultList;
  }
}
