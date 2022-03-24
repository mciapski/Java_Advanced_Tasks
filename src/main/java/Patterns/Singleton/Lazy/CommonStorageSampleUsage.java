package Patterns.Singleton.Lazy;

public class CommonStorageSampleUsage {
  public static void main(String[] args) {
    CommonStorage commonStorageA = CommonStorage.getInstance(); // instancja jest tworzona w tym momencie
    CommonStorage commonStorageB = CommonStorage.getInstance(); // pobranie drugi raz tej samej instancji
    //Sprawdzenie czy obiekty posiadaja taką samą wartośc
    System.out.println(commonStorageA==commonStorageB);

    commonStorageA.addValue(1);
    commonStorageB.addValue(2);
    System.out.println(commonStorageA.getValues().size());
    System.out.println(commonStorageB.getValues().size());
  }
}
