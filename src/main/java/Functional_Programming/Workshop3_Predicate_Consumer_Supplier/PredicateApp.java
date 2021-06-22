package Functional_Programming.Workshop3_Predicate_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// 1. Stwórz Listę obiektów Student,
// 2. Każdy obiekt klasy student powinien posiadać pola: name, age oraz numer indeksu,
// 3. Stwórz predykat do filtrowania po name:
//    a) jako klasę anonimową,
//    a) jako wyrażenie Lambda,
// 4. Stwórz predykat do filtrowania po age,
//    a) jako klasę anonimową,
//    a) jako wyrażenie Lambda,
// 5. Stwórz predykat do filtrowania po indeksNumber
//    a) jako klasę anonimową,
//    a) jako wyrażenie Lambda,
// 6. Stwórz i wywołaj metodę pobierającą listę studentow oraz predykat:
//    b) z zastosowaniem stream()
//    a) z użyciem pętli forEach,



public class PredicateApp {
    public static void main(String[] args) {
        // 1.
        List<Student> students = createData();
        // 3a.
        Predicate<Student> isName = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getName().equals("Bogdan");
            }
        };
        // 3b.
        Predicate<Student> isNameLambda = student -> student.getName().equals("Bogdan");

        // 4a.
        Predicate<Student> byAgeLess30 = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() < 30;
            }
        };
        // 4b.
        Predicate<Student> byAgeLess30Lambda = student -> student.getAge() < 30;

        // 5a.
        Predicate<Student> byIndeksNUmberEndsWith = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getIndeksNumber().endsWith("8");
            }
        };

        // 5b.
        Predicate<Student> byIndeksNUmberEndsWithLambda = student -> student.getIndeksNumber().endsWith("8");

        // 6a. Wywołanie metody
        // 6b.
        System.out.println("Filtrowanie po isName");
        filterStudentsWithStream(students, isName);
        System.out.println("Filtrowanie po isNameLambda");
        filterStudentsWithStream(students, isNameLambda);
        System.out.println("Filtrowanie po byAgeLess30");
        filterStudentsWithStream(students, byAgeLess30);
        System.out.println("Filtrowanie po byAgeLess30Lambda");
        filterStudentsWithStream(students, byAgeLess30Lambda);
        System.out.println("Filtrowanie po byIndeksNUmberEndsWith");
        filterStudentsWithStream(students, byIndeksNUmberEndsWith);
        System.out.println("Filtrowanie po byIndeksNUmberEndsWithLambda");
        filterStudentsWithStream(students, byIndeksNUmberEndsWithLambda);
    }
    // 1. Tworzymy listę studentow
    // 2. Z polami name, age, indeksNumber
    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();
        result.add(new Student("Paweł", 19, "886501"));
        result.add(new Student("Michał", 28, "12381938"));
        result.add(new Student("Bogdan", 30, "897978"));
        return result;
    }

    // 6a. Stworzenie metody ze strumieniem
    private static List<Student> filterStudentsWithStream(List<Student> students, Predicate predicate) {
        //Strumieniowo
        students.stream().filter(predicate).forEach(System.out::println);
        return students;
    }
    // 6b. Stworzenie metody z pętlą
    private static List<Student> filterStudentsWithLoop(List<Student> students, Predicate predicate) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }

        return result;
    }
}
