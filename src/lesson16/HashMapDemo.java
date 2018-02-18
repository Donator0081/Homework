package lesson16;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2/18/2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Кукла", new Toy("Кукла", 100.5));
        map.put("Машинка", new Toy("Машинка", 150.0));
        map.put("Вертолетик", new Toy("Вертолетик", 350.0));
        map.put("Юла", new Toy("Юла", 50.0));
        iterateByEntry(map);
        System.out.println();
        iterateByKey(map);
        System.out.println();
        iterateByValue(map);
    }

    public static void iterateByEntry(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
    }

    public static void iterateByKey(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    public static void iterateByValue(Map<String, Toy> map){
        Collection<Toy>  values = map.values();
        for (Toy toy:values){
            System.out.println(toy);
        }
    }
}
