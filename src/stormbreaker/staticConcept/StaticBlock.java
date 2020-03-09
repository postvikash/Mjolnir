package stormbreaker.staticConcept;

public class StaticBlock {
    StaticBlock staticBlock = new StaticBlock();
    static {
        System.out.println("Inside static block");
        System.out.println("Static block runs at the class load time");
        System.exit(0);
    }
    /*
     * With Java 1.7 release, main method is required at class load time
     */
    public static void main(String[] args) {
        System.out.println("Inside main method");
    }
}
