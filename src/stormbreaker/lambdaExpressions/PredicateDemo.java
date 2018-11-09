package stormbreaker.lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(35);
        arrayList.add(40);
        System.out.println("Elements of array list are : ");
        System.out.println(arrayList);
        Predicate<Integer> p = x-> x%2==0 ? true : false;
        for( Integer i1 : arrayList)
            if(p.test(i1))
                System.out.println(i1);
    }
}
