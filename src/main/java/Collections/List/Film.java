package Collections.List;

import Collections.ListaPiosenek.Piosenka;

import java.util.Comparator;

public class Film implements Comparable<Film> {

  private String title;
  private String author;
  private int yearOfRealease;

  public Film(String title, String author, int yearOfRealease) {
    this.title = title;
    this.author = author;
    this.yearOfRealease = yearOfRealease;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYearOfRealease() {
    return yearOfRealease;
  }
  @Override
  public int compareTo(Film o) {

    return title.compareTo(o.getTitle());
  }

  @Override
  public String toString() {
    return title + ", " + author + ", " + yearOfRealease ;
  }
}
