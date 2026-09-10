package collection;

import java.util.LinkedHashSet;

public class Demo2LinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("Ram");
        l.add("Shyam");
        l.add("Ram");
        l.add("lakshman");
        l.add("Bharat");
        l.add("Karn");

        System.out.println(l);
    }
}
