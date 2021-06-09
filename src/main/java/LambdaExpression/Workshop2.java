package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Program ma dodawać losowe liczby całkowite z przedziału od 0 do 10 do imion zawartych w liście


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
//Operacje za pomocą strumieni i lambd
        //Każda z metod ma interfejs funkcyjny

        names.stream().
                filter(a->a.endsWith("a")).
                //map zamienia jeden typ obiektu w inny
                map(name->name+"!").
                // this::print przekazuje argument "names" jako "String a" do metody print()
                forEach(a->print(a));

        names = filter(names, (input, input2) -> input.endsWith("k"));
        List<String> modifiedNames = new ArrayList<>();

        // KLASA ANONIMOWA
//        for (String name : names) {
//            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
//            String modifiedName = modify(name, new Modifier() {
//                @Override
//                public String modify(String s) {
//                    Random random= new Random();
//                    return name + " " + random.nextInt(11);
//                }
//            });
//            modifiedNames.add(modifiedName);
//        }

        //LAMBDA po pierwszym uproszczeniu
        for (String name : names) {
            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
            String modifiedName = modify(name, n -> {
                Random random = new Random();
                return n + " " + random.nextInt(11);
            });
            modifiedNames.add(modifiedName);
        }
        //LAMBDA po finalnym uproszczeniu uproszczeniu
        for (String name : names) {
            //Implementacja metody modify(z interfejsu) następuje w formie klasy anonimowej "new Modifier"
            String modifiedName = modify(name, n -> n + " " + new Random().nextInt(11));
            modifiedNames.add(modifiedName);
        }
        System.out.println(modifiedNames);
    }

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