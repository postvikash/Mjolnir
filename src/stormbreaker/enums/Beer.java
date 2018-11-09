package stormbreaker.enums;

public enum Beer {
  KINGFISHER,
  CARLSBERG,
  TUBORG,
  BUDWISER;

  Beer() {
    System.out.println("Lets check how many times do I get called");
  }

  public static void main(String[] args) {
    System.out.println(Beer.KINGFISHER);
  }
}
