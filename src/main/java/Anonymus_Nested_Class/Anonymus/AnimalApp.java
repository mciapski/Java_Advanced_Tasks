package Anonymus_Nested_Class.Anonymus;

public class AnimalApp {
    public static void main(String[] args) {
        // Klasy anonimowe stosujemy rzadko, ich działanie jest działanie i tylko na jednym obiekcie
        // DLa każdego nowego obiektu obowiązuje metoda zapisana w klasie Animal
        Animal cat = new Animal() {
            @Override
            void makeVoice() {
                System.out.println("MeowMeow");
            }
        };
        cat.makeVoice();

        //Obiekt i pies i koniec zasięgu nadpisanej metody
        Animal pies = new Animal();
        pies.makeVoice();

        System.out.println("----------------------");
        // Klasy zagnieżdżone
        Animal.Pet pet = cat.new Pet();

    }

}
