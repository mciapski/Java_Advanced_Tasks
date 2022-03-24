package Patterns.Singleton.Lazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {

  // tutaj nie tworzymy instancji
  private static CommonStorage instance;

  //Instancja jest tworzona dopiero przy pobieraniu wartości
  public static CommonStorage getInstance(){
    if(instance==null){
      // Stosując synchronized ten sposób tworzymy singleton double checked -
      // stosujemy w przypadku pobierania dwóch A i B instancji Singletona w tym samym czasie
      synchronized (CommonStorage.class){
        if (instance==null){
          instance=new CommonStorage();
        }
      }
    }
    return instance;
  }
  private CommonStorage(){
  }
  //ukryty konstruktor
  private List<Integer> values = new ArrayList<>();


  public void addValue(final int value){
    values.add(value);
  }
  public List<Integer> getValues(){
    return values;
  }

}
