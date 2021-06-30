package Generic_types.Workshop1;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// Żeby metoda printInformation działała dla obiektów Book i Comics:
// 1. Należy ograniczyć argument parametryczny T do Book,
// 2. Dodatkowo, żeby Klasa ThingBox obsługiwała w ten sam sposób
// Klasę Book to należy klasę Comics rozszerzyć o klasę Book
public class ThingsBox<T extends Book> {
  List<T> resultList;

  public ThingsBox() {
    super();
    this.resultList = new ArrayList<>();
  }



  public List<T> addThingToList(T object) {
    //List<T> resultList = new ArrayList<>();

    resultList.add(object);

    return resultList;
  }

  // W pętli foreach nie można użyć parametru T. Musi to już być typ ograniczający. W tym przypadku Book.
  public <T> void printInformation() {
    for (Book t : resultList) {
      System.out.println(t.getInformation());
    }
  }

  // W pętli foreach nie można użyć parametru T. Musi to już być typ ograniczający. W tym przypadku Book.
  public <T> double sumWeight() {
    double sum = 0;
    for (Book element : resultList) {
      sum += element.getWeight();
    }
    return sum;
  }

  DescriptComparator comparator = new DescriptComparator();

  public <T> void getMaxDesc() {
    System.out.println(resultList.stream().max(comparator));

  }

}



