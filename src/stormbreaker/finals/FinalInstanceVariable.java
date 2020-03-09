package stormbreaker.finals;

class FinalInstanceVariable {
  final int x;

  FinalInstanceVariable(int x) {
    System.out.println("Deafult constructor");
    this.x = x;
  }

  public void display() {
    System.out.println(x);
  }

  public static void main(String[] args) {
    new FinalInstanceVariable(20).display();
  }
}
