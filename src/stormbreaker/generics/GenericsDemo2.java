package stormbreaker.generics;

import java.util.Map;
import java.util.HashMap;

public class GenericsDemo2 {
    public static void main(String[] args) {
        System.out.println("Generics Demo");
        Map<String, Integer> map = new HashMap<String, Integer>();
        GenericMapIterator ob = new GenericMapIterator();
        map.put("ABC", new Integer(1));
        map.put("XYZ", new Integer(2));
        map.put("PQR", new Integer(3));
        ob.display(map);
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(new Integer(1), "ABC");
        map2.put(new Integer(2), "XYZ");
        map2.put(new Integer(3), "PQR");
        ob.display(map2);
    }
}

class GenericMapIterator {
    public <K,V> Map<K,V> display(Map<K,V> map) {
        for(Map.Entry<K,V> entry: map.entrySet()) {
          System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        return map;
    }
}
