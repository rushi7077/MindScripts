package CollectionDemo;

import java.util.Scanner;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<Integer,Integer> treemap = new TreeMap<>();

        for(int i=0;i<n;i++){
            System.out.println("Enter key : ");
            int key = sc.nextInt();
            System.out.println("Enter value : ");
            int value = sc.nextInt();
            treemap.put(key,value);
        }
        System.out.println(treemap);
    }
}
