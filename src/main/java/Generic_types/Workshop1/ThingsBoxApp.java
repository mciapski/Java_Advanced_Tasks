package Generic_types.Workshop1;

import java.util.*;

public class ThingsBoxApp<T extends Book> {
  public static void main(String[] args) {
    List<ThingsBox> thingBoxList = new ArrayList<>();
    ThingsBox<Book> thingBox1 = new ThingsBox<>();
    WeightComparator weightComparator = new WeightComparator();

    thingBox1.addThingToList(new Book(3.0, "Książka o miłości"));
    thingBox1.addThingToList(new Book(6.0, "Książka o piratach"));
    // Możemy dodawać obiekty typu Comics dzięki dziedziczeniu
    thingBox1.addThingToList(new Comics(6.0, "Komiks o piratach"));




    ThingsBox<Comics> thingBox2 = new ThingsBox<>();

    thingBox2.addThingToList(new Comics(1.0, "Komiks DC o Batmanie xxxxxxxxxxxxxx"));
    thingBox2.addThingToList(new Comics(2.0, "Komiks Marvel o Spidermanie "));
    thingBox2.addThingToList(new Comics(2.0, "Komiks Marvel o Spidermanie xxxxxxxxxxxxxxxxx "));
    // Comics extend Book. Nie możemy dodać do listy typu Comics obiektu typu Book
    //thingBox2.addThingToList(new Book(2.0, "Komiks Marvel o Spidermanie "));

    //Wyświetlanie informacji o  obiekcie za pomocą metody printInformation();
    System.out.println("Informacje o thingBox2");
    thingBox2.printInformation();
    //Sumowanie wagi dla koszyka 2
    System.out.println("Waga koszyka 2 to: ");
    System.out.println(thingBox2.sumWeight());
    //Wyświetlanie informacji o  obiekcie thingBox1 za pomocą metody printInformation();
    System.out.println("Informacje o thingBox1");
    thingBox1.printInformation();
    //Sumowanie wagi dla koszyka 1
    System.out.println("Waga koszyka 1 to: ");
    System.out.println(thingBox1.sumWeight());
    //Wywołanie metody getMaxDesc() dla koszyka thingBox2
    System.out.println("Element o najdłuższym opisie w koszyku 2: ");
    thingBox2.getMaxDesc();
    //Wywołanie metody getMaxDesc() dla koszyka thingBox1
    System.out.println("Element o najdłuższym opisie w koszyku 1: ");

    thingBox1.getMaxDesc();

    //Tworzenie listy koszyków
    thingBoxList.add(thingBox1);
    thingBoxList.add(thingBox2);

    //Wywołanie metody getHeavierBox()
    getHeavierBox(thingBoxList, weightComparator);

  }

  private static void getHeavierBox(List<ThingsBox> list, Comparator comparator) {
    System.out.println("Cięższy koszyk");
    System.out.println(list.stream().max(comparator));
  }

}