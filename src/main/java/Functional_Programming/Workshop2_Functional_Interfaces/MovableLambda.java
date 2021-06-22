package Functional_Programming.Workshop2_Functional_Interfaces;

// 1. Wywołaj interfejs funkcyjny Runnable za pomocą klasy anonimowej a następnie za pomocą wyrażenia Lambda,
// 2. Wywołaj interfejs funkcyjny Comparable za pomocą klasy anonimowej a następnie za pomocą wyrażenia Lambda,
// 3. Stwórz własny intrfejs funkcyjny,
//    a następnie wywołaj go za pomocą klasy anonimowej a następnie za pomocą wyrażenia Lambda,

public class MovableLambda {

    public static void main(String[] args) {
        // 1.
        // Interfejs funkcyjny Runnable i klasa anonimowa
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        // 1.
        // Interfejs funkcyjny Runnable i wyrażenie Lambda
        Runnable ru= () -> System.out.println("A");

        // 2.
        // Interfejs funkcyjny Comparable i klasa anonimowa
        Comparable<String> c = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };
        // 2.
        // Interfejs funkcyjny Comparable i wyrażenie Lambda
        Comparable<String> ce = (String o)-> 0; // Domyślnie return 0;

        // 3.
        // Interfejs funkcyjny Movable i klasa anonimowa
        Movable m = new Movable() {
            @Override
            public int move(String direction) {
                return 0;
            }
        };
        // 3.
        // Interfejs funkcyjny Movable i wyrażenie Lambda
        Movable me = (String direction) -> 11;



        // Istnieje możliwość przekazywania do metod obiektów interfejsów funkcyjnych
        test("A",r);
    }
    public static void test(String name, Runnable r){
        r.run();
    }
}
