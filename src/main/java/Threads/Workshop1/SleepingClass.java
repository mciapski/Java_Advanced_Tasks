package Threads.Workshop1;

public class SleepingClass implements Runnable{
  @Override
  public void run() {
    System.out.println("I will go sleep");
    try{
      Thread.sleep(500);
    }catch (InterruptedException i){

      System.out.println("I was interrupted");
    }
    System.out.println("Time to wake up");

  }
}
