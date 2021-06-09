package Interfaces_Abstract.Zad5_1;
/*
1. W paczce com.sda.zoo stwórz nowy interfejs FlyBehavior z jedną metodą:String fly(double height)
2. Stwórz klasę Eagle implementującą interfejs FlyBehavior.Implementacja metody fly niech wypisuje w konsoli na nazwę zwierzęcia i wysokość lotu.
3. Stwórz klasę Duck implementującą interfejs FlyBehavior.Implementacja metody fly niech wypisuje w konsoli na nazwę zwierzęcia i wysokość lotu.Uwaga: kaczka nie może latać na wysokości wyższej niż 100 jednostek.
4. W paczce com.sda.zoo stwórz nowy interfejs RunBehavior z jedną metodą:void run(double speed).
5. Niech klasa Eagle implementuje interfejs RunBehavior.Implementacja metody run niech wyświetla wiadomość i ogranicza prędkość do 5.
6. Niech klasa Duck implementuje interfejs RunBehavior.Implementacja metody run niech wyświetla wiadomość i ogranicza prędkość do 20.
7. Zaprezentuj działanie zaimplementowanych klas. Sprawdź mechanizm polimorfizmu w tym przypadku - do obiektu typu FlyBehavior lub RunBehavior może być przypisana dowolna implementacja interfejsu.

 */

public class App {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println(duck.fly(100));
        duck.run(5);
        System.out.println(duck.toString());

        Eagle eagle =new Eagle();
        System.out.println(eagle.toString()+" "+ eagle.fly(100));
        eagle.run(4);


// Metoda  abstrakcyjna może zostać nadpisana w klasie anonimowej
// Jest to rozwiąznie dobrze przy małych aplikacjach.
// Domyślnie tworzymy osobne klasy do nadpisywania i rozszerzania metod abstrakcyjnych
//W poniższy sposób nadpisujemy metodę eat w klasie anonimowej
        Animal animal = new Animal() {
            @Override
            void eat(String something) {
                System.out.println("Uwielbia: " + something);
            }
        };
//Instancja klasy anonimowej z działającą nadpisaną metodą
      Animal anotherDuck=new Duck();
//Wywołanie metody eat nadpisanej w klasie anonimowej
      anotherDuck.eat("Chleb");
//Wywołanie metody eat nadpisanej w klasie eagle
      eagle.eat("Mięso");
    }
}
