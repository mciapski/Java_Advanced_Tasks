package Functional_Programming.Workshop3_Predicate_Consumer_Supplier;

public class Student {
    private String name;
    private int age;
    private String indeksNumber;

    public Student(String name, int age, String indeksNumber) {
        this.name = name;
        this.age = age;
        this.indeksNumber = indeksNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIndeksNumber() {
        return indeksNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", indeksNumber='" + indeksNumber + '\'' +
                '}';
    }
}
