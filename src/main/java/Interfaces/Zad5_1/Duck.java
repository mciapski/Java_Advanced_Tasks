package Interfaces.Zad5_1;

public class Duck  extends Animal implements FlyBehavior,RunBehavior {


    public Duck() {
        super(false);
    }

    @Override
    public String fly(double height) {
        if (height <= 100) {
            return "Duck can fly on: " + height + " height.";
        }
        return "Ducks cannot fly so high";
    }

    @Override
    public void run(double speed) {
        if(speed<=20){
            System.out.println("Maximum speed for duck is: "+speed);
        }else {
            System.out.println("Speed is exceeded");
        }
    }

    @Override
    public String toString() {
        return "Duck";
    }

    @Override
    void eat(String something) {
        System.out.println("Uwielbia: " + something);
    }
}
