package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExcercise {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Adam");
    hashSet.add("Bożena");
    hashSet.add("Jan");

    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Adam");
    treeSet.add("Jan");
    treeSet.add("Bożena");

    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("Adam");
    linkedHashSet.add("Bożena");
    linkedHashSet.add("Jan");

    System.out.println(hashSet);
    System.out.println(treeSet);
    System.out.println(linkedHashSet);



  }
}
