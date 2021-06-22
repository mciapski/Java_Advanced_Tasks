package Functional_Programming.Workshop3_Predicate_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// 1. Stwórz Listę obiektów Student,
// 2. Stwórz obiekt klasy Consumer w celu wyświetlenia name,
//    a) jako klasę anonimową,
//    a) jako wyrażenie Lambda,
// 3. Stwórz obiekt klasy Consumer w celu wyświetlenia name zmienionego na duże litery,
//    a) jako wyrażenie Lambda,
// 4. Stwórz obiekt klasy Consumer w celu wyświetlenia name z małymi literami a następnie z dużymi,
// 5. Stwórz i wywołaj metodę pobierającą listę studentow oraz predykat:
//    b) z zastosowaniem stream()
//    a) z użyciem pętli forEach,
public class CustomerApp {
    public static void main(String[] args) {
        //1.
        List<Student> students = createData();
        //2a.
        Consumer<Student> printStudentName = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName());
            }
        };
        //2b.
        Consumer<Student> printStudentNameLambda = student -> System.out.println(student.getName());
        //3a.
        Consumer<Student> printStudentNameLambdaUppercase = student -> System.out.println(student.getName().toUpperCase());
        //4.
        Consumer<Student> printThenOther = printStudentNameLambda.andThen(printStudentNameLambdaUppercase);
        //5a - wywołana metoda z foreach;
        consumeStudents(students, printStudentName);
        consumeStudents(students, printStudentNameLambda);
        consumeStudents(students, printStudentNameLambdaUppercase);
        consumeStudents(students,printThenOther);
        //5b - wywołana metoda ze stream();
        consumeStudentsStream(students, printStudentNameLambdaUppercase);
    }
    //1.
    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();
        result.add(new Student("Paweł", 19, "886501"));
        result.add(new Student("Michał", 28, "12381938"));
        result.add(new Student("Bogdan", 30, "897978"));
        return result;
    }
    //5a. Definicja metody z foreach
    private  static void consumeStudents(List<Student> studentList, Consumer consume){
        for (Student s: studentList) {
            consume.accept(s);
        }

    }
    //5b. Definicja metody ze stream()
    private static void consumeStudentsStream(List<Student> studentList, Consumer consume){
        studentList.stream().forEach(consume);
    }
}
