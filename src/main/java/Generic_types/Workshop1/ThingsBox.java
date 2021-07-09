package Generic_types.Workshop1;

import org.junit.Test;

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

  // Metoda ma dostęp do parametru T więc nie musi go mieć w nazwie: public <T> void printInformation()
  @Test
  public void printInformation() {
    for (T t : resultList) {
      System.out.println(t.getInformation());
    }
  }


  // Metoda ma dostęp do parametru T więc nie musi go mieć w nazwie: public <T> double sumWeight()
  public double sumWeight() {
    double sum = 0;
    for (T element : resultList) {
      sum += element.getWeight();
    }
    return sum;
  }

  DescriptComparator<T> comparator = new DescriptComparator();
  // Metoda ma dostęp do parametru T więc nie musi go mieć w nazwie: public <T> void getMaxDesc()
  public void getMaxDesc() {
    System.out.println(resultList.stream().max(comparator));

  }

  @Override
  public String toString() {
    return "ThingsBox{"+
        "Waga: "+ sumWeight()+"\n"+
        " Zawartość=" + resultList +
        '}';
  }
}



