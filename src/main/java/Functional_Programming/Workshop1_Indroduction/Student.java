package Functional_Programming.Workshop1_Indroduction;
//Zasady programowania funkcyjnego:
// 1. Klasy immutable
// 2. Czyste metody
// 3. Unikamy nulli - stosujemy Optional

import java.util.Optional;

// Klasa Immutable
final public class Student {
    private String name;
    private int age;
    private Indeks indeks;

    public Student(String name, int age, String indeksNumber) {
        this.name = name;
        this.age = age;
        this.indeks = new Indeks(indeksNumber);
    }
//Mając konstruktor z polami name oraz age, pole indeks nie ma wartości
// Aby uniknąć, że indeks=null, stosujemy Optional
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
// Optional - jakaś wartośc może być, a może nie być (Od Javy 8)
// Nie dostajemy NullPointerException i możemy wykonać dalszy krok logiki biznesowej
    public Optional<Indeks> getIndeks() {
        return Optional.ofNullable(this.indeks);
    }

    public String getStudentInformation(){
        return this.name + " " + this.age;
    }

    public Student changeIndeksNumber(String newIndeksNumber){
        return new Student(name, age, newIndeksNumber);
    }
}
