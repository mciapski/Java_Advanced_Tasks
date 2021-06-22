package Interfaces.Zad5_1;

public abstract class Animal {
    private boolean eatsMeat;

    public Animal() {
        this.eatsMeat = false;
    }
    public Animal(Boolean eatsMeat) {
        this.eatsMeat = eatsMeat;
    }

    public boolean isEatsMeat() {
        return eatsMeat;
    }

    abstract void eat (String something);
}
