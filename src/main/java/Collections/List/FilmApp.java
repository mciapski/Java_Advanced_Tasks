package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class FilmApp {
  public static void main(String[] args) {
    List<Film> filmListToSort = new ArrayList<>();

    filmListToSort.add(new Film("Titanic","DiCaprio",1000));
    filmListToSort.add(new Film("Titanic","DiCaprio",3000));
    filmListToSort.add(new Film("Titanic","DiCaprio",2000));

    System.out.println(filmListToSort);

    filmListToSort.sort((o1, o2) -> Integer.compare(o1.getYearOfRealease(),o2.getYearOfRealease()));

    System.out.println(filmListToSort);
  }
}
