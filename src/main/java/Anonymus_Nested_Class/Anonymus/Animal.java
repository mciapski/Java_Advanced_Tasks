package Anonymus_Nested_Class.Anonymus;

public class Animal {

    void makeVoice(){
        System.out.println("Grrrrr");
    }

    void eat(){
        System.out.println("Om Om Om");
    }

    //Klasa zagnieżdżona
    // zaletą jest dostęp do metod klasy Animal
    class Pet{
        String name;

        void getName(){
            //eat();
            //makeVoice();
            System.out.println(name);
        }
    }
}
