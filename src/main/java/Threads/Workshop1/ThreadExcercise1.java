package Threads.Workshop1;

public class ThreadExcercise1 {
  public static void main(String[] args) {

    new Thread(()-> System.out.println("Hello from other thread")).start();
    //System.out.println(Thread.currentThread().getId());
    Thread sleepingThread = new Thread(new SleepingClass());
    sleepingThread.start();
    sleepingThread.interrupt();

  }
}
