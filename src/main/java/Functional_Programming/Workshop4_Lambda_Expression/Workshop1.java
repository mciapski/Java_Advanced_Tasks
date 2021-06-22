package Functional_Programming.Workshop4_Lambda_Expression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Program sortuje wartości listy wg. wzrastającej ilości znaków


public class Workshop1 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

        // @FunctionalInterface - Interfejs funkcyjny więc możęmy jego metodę wykorzystać do lambdy
        //public interface Comparator<T> {
        // int compare(T o1, T o2);

        //String::length - przekazanie referencji do metody
        //moteoda comparingInt zwraca Comparator
        names.sort(Comparator.comparingInt(String::length));

        // LAMBDA
        // (o1, o2) - argumenty
        // Integer.compare(o1.length(), o2.length()) - wywołanie metody compare na obiekcie Integer
        // w domyśle działa RETURN
        names.sort((o1,o2)->Integer.compare(o1.length(), o2.length()));
        System.out.println(names);

        //METODA ANONIMOWA
        // Comparator - w tym przypadku umożliwia sortowanie po ilości znaków
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(names);
    }
}