package Generic_types;

public class GenericClassApp {
    public static void main(String[] args) {
        GenericClass<Double> genericClass = new GenericClass<>(10.0);
        GenericClass<String> genericClassString = new GenericClass<>("Opis");

        genericClass.nameOfGenericType();
        genericClassString.nameOfGenericType();

        double wartosc = genericClass.getGenericArea();
    }
}
