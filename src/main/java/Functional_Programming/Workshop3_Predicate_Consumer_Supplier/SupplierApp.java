package Functional_Programming.Workshop3_Predicate_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 1. Stwórz listę studentów za pomoca interfejsu Supplier
// 2. Stwórz predykat filtrujący po studentach powyżej 30 roku życia
// 3. Stwórz obiekt interfejsu Consumer w celu wyświetlenia listy.
// 4. Stwórz metodę filtrującą, która pobiera listę oraz predykat,
// 6. Stwórz i wywołaj metodę pobierającą przefiltrowaną listę oraz consumer.

public class SupplierApp {
    public static void main(String[] args) {
        // 1.
        Supplier<List<Student>> supplyPredefinedStudents = () -> createData();
        // 2.
        Predicate<Student> byAgeOver30 = student -> student.getAge() < 30;
        // 3.
        Consumer<Student> printStudentName = student -> System.out.println(student.getName());

        // 6. Wywołanie
        consumeStudents(filterStudents(supplyPredefinedStudents, byAgeOver30), printStudentName);

    }

    //1.
    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();
        result.add(new Student("Paweł", 19, "886501"));
        result.add(new Student("Michał", 28, "12381938"));
        result.add(new Student("Bogdan", 30, "897978"));
        return result;
    }


    //5.
    private static List<Student> filterStudents(Supplier<List<Student>> supplier, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        //List<Student> students = supplier.get();

        for (Student s : supplier.get()) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
    //6.
    private static void consumeStudents(List<Student> studentList, Consumer consume) {
        for (Student s : studentList) {
            consume.accept(s);
        }

    }
}
