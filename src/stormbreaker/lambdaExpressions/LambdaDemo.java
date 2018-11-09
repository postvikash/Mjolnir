package stormbreaker.lambdaExpressions;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

interface DemoInterface {
  public abstract int sum(int a, int b);
  default void func() {
    System.out.println(" World Hello");
  }
    public static void sayHi() {
      System.out.println("Hello World");
    }
}


public class LambdaDemo {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = 0,b = 0;
      DemoInterface demoInterface = (x,y)-> x+y;
      try {
          a = sc.nextInt();
          b = sc.nextInt();
      } catch(InputMismatchException ex) {
        System.out.println("Exception caught : "+ex);
      }
      System.out.println("Sum of "+a+" and "+b+" is : "+demoInterface.sum(a,b));
      DemoInterface.sayHi();
      demoInterface.func();

  }
}
