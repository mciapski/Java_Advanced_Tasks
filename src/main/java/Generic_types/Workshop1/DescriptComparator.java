package Generic_types.Workshop1;

import java.util.Comparator;

public class DescriptComparator<T extends  Book> implements Comparator<T> {

  @Override
  public int compare(T o1, T o2) {
    //return o1.getInformation().length()-o2.getInformation().length();
    return Integer.compare(o1.getInformation().length(),o2.getInformation().length());
  }
}
