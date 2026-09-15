package CollectionDemo;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(22,"Red");
        map.put(56,"Green");
        map.put(84,"Yellow");
        map.put(12,"Pink");
        map.put(84,"White");
        map.put(78,"Blue");

        System.out.println(map);

        System.out.println(map.size());
        map.remove(12);
        System.out.println(map);
        map.replace(78,"Purple");
        System.out.println(map);
        map.putIfAbsent(22,"Orange");
        System.out.println(map);
        map.putIfAbsent(25,"Orange");
        System.out.println(map);

    }
}
