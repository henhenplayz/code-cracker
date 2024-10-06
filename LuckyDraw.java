//package project5;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int inputs = Integer.parseInt(sc.next());
        // int count = 0;
        // int coll[] = {7, 1, 3, 6, 2, 1, 2, 4, 8};
        // for(int i = 0; i < coll.length; i++) {
        //     arr.add(coll[i]);
        // }
        for(int i = 0; i < inputs; i++) {
            arr.add(Integer.parseInt(sc.next()));
        }

        for(int i = 0; i < arr.size()-1; i++) {
            //System.out.println(arr.get(i));
            if ((arr.get(i) + arr.get(i+1)) % 2 == 0) {
                // System.out.println(arr.get(i));
                arr.remove(i);
                arr.remove(i);
                // System.out.println(arr.get(i));
                // System.out.println("This is i:" + i);
                if (i > 0) {
                    i--;
                }
                i--;
            }
            // System.out.println("This is i:" + i);

        }
        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.print(arr.get(i) + ", ");
        // }
        System.out.print(arr.size());
        sc.close(); 
    }
}
