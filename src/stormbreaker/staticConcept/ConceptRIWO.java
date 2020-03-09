package stormbreaker.staticConcept;

public class ConceptRIWO {
    static int x = 100;

    static {
        System.out.println("Static Block");
        System.out.println("The value of x in static block " +x); // Direct Reference
        /*The following statement would lead to Illegal forward reference error*/
        //System.out.println(y); 
        func();
    }

    {
        System.out.println("This is instance block");
        System.out.println("Instance block gets executed when an object gets created");
    }
    
    public static void main(String[] args) {
        System.out.println("Inside main method");
        func();
        new ConceptRIWO();
    }

    public static void func() {
        System.out.println("The value of x in method func "+x); //Indirect reference
        System.out.println("The value of y in method func "+y); //Indirect reference
    }

    static int y = 200;
}
