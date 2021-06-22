package Functional_Programming.Workshop4_Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// 1. Utwórz listę imion
// 2. Za pomocą strumienia przefiltruj listę i wybierz imiona kończące się na "a"
// 3. W tej samej operacji strumienia za pomoca map dodaj do imion znak "!" i wyświetl wszystkie pozostajac w jednej linijce,
// 4. Do każdego imienia dodaj losową liczbę z przedziału 0...10
// 5. Zrób to za pomoca klasy anonimowej
// 6. To samo za pomocą lambdy i jej finalnej postaci
// 7. To samo za pomoca referencji do metody


public class Workshop2 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

        // 1.
        // 2.
        // 3.
        names.stream().
                filter(a->a.endsWith("a")).
                //map zamienia jeden typ obiektu w inny
                map(name->name+"!").
                // this::print przekazuje argument "names" jako "String a" do metody print()
                forEach(a->print(a));

        names = filter(names, (input, input2) -> input.endsWith("k"));
        List<String> modifiedNames = new ArrayList<>();

        // 4.
        // 5.
        for (String name : names) {
            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
            String modifiedName = modify(name, new Modifier() {
                @Override
                public String modify(String s) {
                    Random random= new Random();
                    return name + " " + random.nextInt(11);
                }
            });
            modifiedNames.add(modifiedName);
        }
        // 6.
        //LAMBDA po pierwszym uproszczeniu
        for (String name : names) {
            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
            String modifiedName = modify(name, n -> {
                Random random = new Random();
                return n + " " + random.nextInt(11);
            });
            modifiedNames.add(modifiedName);
        }

        //6.
        //LAMBDA po finalnym uproszczeniu uproszczeniu
        for (String name : names) {
            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
            String modifiedName = modify(name, n -> n + " " + new Random().nextInt(11));
            modifiedNames.add(modifiedName);
        }
        System.out.println(modifiedNames);
    }
// Metoda przyjmująca listę oraz obiekt interfejsu Filter
    private static List<String> filter(List<String> input, Filter filter) {
        List<String> resultList = new ArrayList<>();
        for (String name : input) {
            if (filter.filter(name,"aaaaa")) {
                resultList.add(name);
            }
        }
        return resultList;
    }

    private static String modify(String string, Modifier modifier) {
        return modifier.modify(string);
    }

    private static void print(String a){

        System.out.println(a);
    }
}