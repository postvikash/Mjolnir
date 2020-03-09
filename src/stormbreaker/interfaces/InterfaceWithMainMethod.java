package stormbreaker.interfaces;

@FunctionalInterface
public interface InterfaceWithMainMethod {

    public static void main(String[] args) {
        System.out.println("Function interface with main method");
    }

    default void displayGreetingMessage() {
        System.out.println("Hello");
    }

    void youMustOverRide();
}
