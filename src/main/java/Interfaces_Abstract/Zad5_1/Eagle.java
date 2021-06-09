package Interfaces_Abstract.Zad5_1;

import jdk.swing.interop.SwingInterOpUtils;

public class Eagle extends Animal implements FlyBehavior, RunBehavior {
    public Eagle() {
        super(false);
    }

    @Override
    public String fly(double height) {
        return "Eagle can fly on: " + height + " height.";
    }

    @Override
    public void run(double speed) {
        if (speed <= 5) {
            System.out.println("Maximum speed for Eagle is: " + speed);

        } else {
            System.out.println("Speed is exceeded");
        }
    }

    @Override
    public String toString() {
        return "Eagle";
    }

    @Override
   void eat(String something) {
        System.out.println("Uwielbia: " + something);
   }
}