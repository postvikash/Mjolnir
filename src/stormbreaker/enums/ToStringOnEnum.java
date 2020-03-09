package stormbreaker.enums;

public class ToStringOnEnum {
   public enum ResourceType {
        ITEM("items");

        private String resource;

        ResourceType(String resource) {
            System.out.println("ENUM Object initialized");
            this.resource = resource;
        }
    }

    public static void main(String[] args) {
        System.out.println("Verify toString method on enum object");
        System.out.println(ResourceType.ITEM.toString());
    }
}

