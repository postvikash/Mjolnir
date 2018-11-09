package stormbreaker.lambdaExpressions;

public class AnnonymousInnerClassDemo {
  public static void main(String[] args) {
    Runnable r = new Runnable() {
      public void run() {
        for(int i=0;i<5;i++) {
          try {
            Thread.sleep(1000);
          } catch(InterruptedException ex) {
            System.out.println("Main thread interrupted");
          }
          System.out.println("Child thread "+i);
        }
      }
    };
    Thread t = new Thread(r);
    t.start();
    for(int i=0;i<5;i++) {
      try {
        Thread.sleep(1000);
      } catch(InterruptedException ex) {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread "+i);
    }
  }
}
