package stormbreaker.enums;

public class EnumAsInnerClass {

    private static final Integer x = 200;

    public enum ResourceType {
        ITEMS("items"),
        DEVICE("device"),
        PAYMENT("payment"),
        CONTEXT("context");

        private final String resource;



        ResourceType(String resource) {
            this.resource = resource;
        }

        public String getResoure() {
            return resource;
        }
    }

    public static void main(String[] args) {
        System.out.println(ResourceType.ITEMS.getResoure());
        System.out.println(x.equals(200));
    }
}
