package stormbreaker.generics;

public class GenericsDemo1 {
    public static void main(String[] args) {
        System.out.println("Generics Demo");
        MyGenericClass<Integer> ob = new MyGenericClass<Integer>();
        ob.setX(new Integer(10));
        System.out.println(ob.getX());
    }
}

class MyGenericClass<T> {
    private T x;
    public T getX() {
        return this.x;
    }
    public void setX(T x) {
        this.x = x;
    }
}
