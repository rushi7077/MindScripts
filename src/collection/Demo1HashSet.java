package collection;

import java.util.HashSet;
import java.util.Scanner;

public class Demo1HashSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many no. do you want to add in set : ");
        int n = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            hs.add(num);
        }

        hs.add(7);
        hs.add(10);
        hs.add(45);
        hs.add(18);
        hs.add(17);
        hs.add(33);
        hs.add(7);

        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(7));
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(7));
    }
}
