package Stream.Workshop3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
starting again from a list of names, give me the total number of letters in all the names with more than 5 letters
 */
public class LetterCount {

  //  public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
//    List<String> ListOfNames = List.of(names);
//    int sumOfLetters = ListOfNames.stream()
//        .mapToInt(x->x.length())
//        .filter(x->x>5)
//        .sum();
//    return sumOfLetters;
//  }
  public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
    int sumOfLetters = Stream.of(names)
        .mapToInt(x -> x.length())
        .filter(x -> x > 5)
        .sum();
    return sumOfLetters;
  }

  public static List<String> NameListCreator(String... names) {
    List<String> nameList = Stream.of(names)
        .map(x -> x.toUpperCase(Locale.ROOT))
        .collect(Collectors.toList());
    return nameList;
  }
}
