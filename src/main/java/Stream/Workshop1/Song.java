package Stream.Workshop1;

import java.time.LocalDate;
import java.util.Objects;

public class Song {
  private String title;
  private String artist;
  private double lastOfSong;
  private LocalDate releaseDate;


  public Song(String title, String artist, double lastOfSong, LocalDate releaseDate) {
    this.title = title;
    this.artist = artist;
    this.lastOfSong = lastOfSong;
    this.releaseDate = releaseDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Song song = (Song) o;
    return Objects.equals(artist, song.artist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist);
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public double getLastOfSong() {
    return lastOfSong;
  }


  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  @Override
  public String toString() {
    return "Song{" +
        "title='" + title + '\'' +
        ", artist='" + artist + '\'' +
        ", lastOfSong=" + lastOfSong +
        ", releaseDate=" + releaseDate +
        '}';
  }
}
