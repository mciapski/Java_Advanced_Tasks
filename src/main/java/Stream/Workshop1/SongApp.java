package Stream.Workshop1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
1. limit - we can reduce stream elements to some amount
2. skip - we can skip some elements in stream
3. distinct - reduce duplicate elements in stream (we have to override method equals and hashcode in class)
4. count - return amount of elements in stream
*/
public class SongApp {
  public static void main(String[] args) {

    List<Song> songList = new ArrayList<>();
    SongMethods cleaner = new SongMethods();
    Predicate<Song> byTitleStartWithN = song -> song.getTitle().startsWith("N");
    Predicate<Song> byLastOfSongMoreThen4Min = song -> song.getLastOfSong() > 4.0;

    Comparator<Song> byTitle = (title1, title2) -> title1.getTitle().compareTo(title2.getTitle());
    Comparator<Song> byLastSong = (title1, title2) -> Double.compare(title1.getLastOfSong(), title2.getLastOfSong());
    Comparator<Song> byReleaseDate = (title1, title2) -> title1.getReleaseDate().compareTo(title2.getReleaseDate());

    songList.add(new Song("Nothing Else Matters", "Metallica", 3.45, LocalDate.of(1990, 9, 9)));
    songList.add(new Song("Nothing compares 2you", "Sinead O'Connor", 5.09, LocalDate.of(1990, 1, 9)));
    songList.add(new Song("Mama", "Genesis", 6.49, LocalDate.of(1983, 8, 22)));
    songList.add(new Song("Keeper", "Reignwolf", 3.34, LocalDate.of(2021, 5, 1)));
    songList.add(new Song("The Void", "MUSE", 4.44, LocalDate.of(2018, 1, 1)));
    songList.add(new Song("The DarkSIde", "MUSE", 4.13, LocalDate.of(2018, 1, 1)));

    System.out.println("Ordered by Title");
    cleaner.orderedBy(songList, byTitle);

    System.out.println("Ordered by Last Song");
    cleaner.orderedBy(songList, byLastSong);

    System.out.println("Ordered by Release Date");
    cleaner.orderedBy(songList, byReleaseDate);

    System.out.println("Sum of Lasting each song");
    cleaner.sumTimeAllSongs(songList);

    System.out.println("Max Last Time Song");
    cleaner.maxSongTime(songList, byLastSong);

    System.out.println("Max Last Time Song by Reduce");
    cleaner.maxSongByReduce(songList);

    System.out.println("Songs last more then 4 min");
    cleaner.filterBy(songList, byLastOfSongMoreThen4Min);

    System.out.println("Reduce the same artist");
    cleaner.eliminateTheSameArtist(songList);
  }
}


