package Patterns.Singleton.Eager;

public class SimpleCounter {

  //pole statyczne w którym przetrzymujemy referencję singletonu
  // jest to singleton typu eager więc instancję tworzymy od razu, przypisując ją do pola
  private static final SimpleCounter INSTANCE = new SimpleCounter();

  //Getter dla referencji singletonu
  public static SimpleCounter getInstance(){
    return INSTANCE;
  }
  //ukryty konstruktor
  private SimpleCounter(){
  }

  private int currentCount = 0;

  public int getCurrentCount(){
    return currentCount;
  }

  public void increment(){
    currentCount++;
  }

}
