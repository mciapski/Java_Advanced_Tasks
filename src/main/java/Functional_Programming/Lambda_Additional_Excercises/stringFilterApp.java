package Functional_Programming.Lambda_Additional_Excercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stringFilterApp{
  public static void main(String[] args) {
    List<String> stringListToFilter = new ArrayList<>();
    List<Integer> listToOperate = List.of(5,5,6,6);

    Integer sum = listToOperate.stream().reduce(0, (x,element)->x+element);
    System.out.println(sum);

    stringListToFilter.add("Kowalskiiiiiiiiiiii");
    stringListToFilter.add("Misiewicz");
    stringListToFilter.add("Karolewicz");
    stringListToFilter.add("xx");
    stringListToFilter.add("aa");
    stringListToFilter.add("cc");
    stringListToFilter.add("ddd");

    stringListToFilter.stream().filter(x -> x.endsWith("wicz")).forEach(System.out::println);

  StringFilter stringFilter = new StringFilter() {
    @Override
    public void filterList(List<String> list) {
    }
  };
    System.out.println(stringListToFilter);
    stringFilter.filterListInDefaultWay(stringListToFilter);
    System.out.println(stringListToFilter);

   Map<Object,List<String>> lista =  stringListToFilter.stream().collect(Collectors.groupingBy(String::valueOf));

  }



}