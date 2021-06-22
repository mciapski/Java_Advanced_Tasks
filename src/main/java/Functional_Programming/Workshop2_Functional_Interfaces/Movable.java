package Functional_Programming.Workshop2_Functional_Interfaces;

//Interfejs funkcujny może mieć tylko jedna metodę
@FunctionalInterface
public interface Movable {
    public int move(String direction);
}
