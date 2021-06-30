package Generic_types.Workshop1;

import java.util.Comparator;

public class WeightComparator<T extends ThingsBox & Comparator<? super T>> implements Comparator<T> {


  @Override
  public int compare(T o1, T o2) {
    if (o1.sumWeight() > o2.sumWeight()) {
      return 1;
    }
    return -1;
  }
}