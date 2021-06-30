package Abstract_class.Workshop1_Abs_Shape;

import java.util.ArrayList;
import java.util.List;

// 1. Utwórz klasę abstrakcyjną z konstruktorami oraz metodami pozwalającymi na
// stworzenie obieków typu Triangle oraz Rectangular za pomoca klas dziedziczących,
// 2. W klasie abstrakcyjnej umieść przeciążone konstruktory:
// - konstruktor bezparametrowy,
// - konstruktor ze wszystkimi parametrami (width, height, name) i bez założeń,
// - konstruktor z jednym parametrem (width) oraz z założeniem w=h,
// - konstruktor z parametrem w postaci innego obiektu
// 3. W klasie abstrakcyjnej umieść metodę liczącą pole powierzchni,
// 4. Przesłoń ją odpowiednio w klasach dziedziczących
// 5. W klasie głównej aplikacji stwórz listę z różnymi wariantami obiektów oraz odpowiednio wyświetl.

public class AbsShapeApp {
    public static void main(String[] args) {


        List<TwoDShape> listOfPatterns = new ArrayList<>();

        listOfPatterns.add(new Triangle(8.0,12.0,"pusty"));
        listOfPatterns.add(new Rectangle(10.0));
        listOfPatterns.add(new Rectangle(10.0,4.0));
        listOfPatterns.add(new Triangle(7.0));

        for (int i = 0; i < listOfPatterns.size(); i++) {
            System.out.println("Typ obiektu to: " + listOfPatterns.get(i).getName());
            System.out.println("A jego powierzchnia wynosi: " + listOfPatterns.get(i).area());
            System.out.println();
        }
    }
}