package stormbreaker.exceptionHandling;

public class ExceptionHandlingDemo1 {
  public static void main(String[] args) {
    try {
      func1();
    }
    catch(NullPointerException e) {
      System.out.println("Handling the exception");
      //System.out.println(e.toString());
      //System.out.println(e.getMessage());
      e.printStackTrace();
    }
    System.out.println("Exception handling Demo1");
  }
  public static void func1() {
    throw new NullPointerException("Throwing NPE from func1");
  }
}
