/*import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
    }
}*/

import java.util.*;
class Main{
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int left =0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
