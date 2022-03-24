package Functional_Programming.Lambda_Additional_Excercises;

import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface StringFilter {
  void filterList(List<String> list);
  default void filterListInDefaultWay(List<String> list){
list.sort((o1, o2) -> Integer.compare(o1.length(),o2.length()));
  }

}
