package Patterns.Singleton.Eager;

public class SimpleCounterUsage {
  public static void main(String[] args){
    SimpleCounter simpleCounterA = SimpleCounter.getInstance();
    SimpleCounter simpleCounterB = SimpleCounter.getInstance();

    simpleCounterA.increment();
    simpleCounterB.increment();
    System.out.println(simpleCounterA.getCurrentCount());
    System.out.println(simpleCounterB.getCurrentCount());
  }
}
