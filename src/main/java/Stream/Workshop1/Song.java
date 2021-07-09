package Stream.Workshop1;

import java.time.LocalDate;

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
