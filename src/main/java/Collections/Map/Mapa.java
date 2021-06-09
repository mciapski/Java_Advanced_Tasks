package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

// Stworzyć mapę i wyświetlić jej zawartość na dwa sposoby:
// 1. za pomocą strumienia i forEach
// 2. za pomocą pętli forEach

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> mapaUtworow = new HashMap<>();

        //Mapa nie jest kolekcją więc zamieniamy mapę na zbiór wpisów (Entry entrySet)
        Stream<Map.Entry<Integer, String>> fromMap =
                mapaUtworow.entrySet().stream();

        //Uzupełnianie mapy
        mapaUtworow.put(1, "JolkaJolka");
        mapaUtworow.put(2, "Dzień gorącego lata");
        mapaUtworow.put(3, "Jutro");

        // 1. Sposób wyświetlania
        fromMap.forEach(System.out::println);

        // 2. Sposób wyświetlania
        for (Map.Entry<Integer, String> entry : mapaUtworow.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + "||" + "Wartość: " + entry.getValue());
        }
    }
}
