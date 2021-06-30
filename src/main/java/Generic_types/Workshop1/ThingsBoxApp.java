package Generic_types.Workshop1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThingsBoxApp<T extends Book> {
  public static void main(String[] args) {

    ThingsBox<Book> thingBox1 = new ThingsBox<>();

    thingBox1.addThingToList(new Book(3.0, "Książka o miłości"));
    thingBox1.addThingToList(new Book(6.0, "Książka o piratach"));
    // Możemy dodawać obiekty typu Comics dzięki dziedziczeniu
    thingBox1.addThingToList(new Comics(6.0, "Komiks o piratach"));


    thingBox1.printInformation();
    System.out.println(thingBox1.sumWeight());

    ThingsBox<Comics> thingBox2 = new ThingsBox<>();

    thingBox2.addThingToList(new Comics(1.0, "Komiks DC o Batmanie xxxxxxxxxxxxxx"));
    thingBox2.addThingToList(new Comics(2.0, "Komiks Marvel o Spidermanie "));
    thingBox2.addThingToList(new Comics(2.0, "Komiks Marvel o Spidermanie xxxxxxxxxxxxxxxxx "));
    // Comics extend Book. Nie możemy dodać do listy typu Comics obiektu typu Book
    //thingBox2.addThingToList(new Book(2.0, "Komiks Marvel o Spidermanie "));

    thingBox2.printInformation();
    System.out.println(thingBox2.sumWeight());
    thingBox2.getMaxDesc();
    thingBox1.getMaxDesc();



  }

}