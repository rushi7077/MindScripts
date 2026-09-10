package collection;

import java.util.TreeSet;

public class Demo3TreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

        t.add(12);
        t.add(56);
        t.add(45);
        t.add(56);
        t.add(78);
        t.add(7077);

        System.out.println(t);

        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.higher(45));
        System.out.println(t.lower(78));
        System.out.println(t.ceiling(43));
        System.out.println(t.floor(80));
    }
}
