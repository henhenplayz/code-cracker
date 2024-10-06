// package project5;

import java.util.ArrayList;
import java.util.Scanner;

public class DailyPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean newline = true;
        int lines = Integer.parseInt(sc.next());
        int numInputs = 0;
        int out = 0;
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // System.out.println(lines);
        for (int i = 0; i < lines; i++) {
            if (newline == true) {
                numInputs = Integer.parseInt(sc.next());

            }
            for (int j = 0; j < numInputs; j++) {
                int add = Integer.parseInt(sc.next());
                nums.add(add);
            }

            for (int k = 0; k < nums.size(); k++) {
                int add = nums.get(k);
                if (add > highest) {
                    highest = add;
                }
                if (add < lowest) {
                    lowest = add;
                }
            }

            // System.out.println(highest);
            // System.out.println(lowest);
            nums.remove(nums.indexOf(highest));
            nums.remove(nums.indexOf(lowest));
            out += highest - lowest;
            lowest = Integer.MAX_VALUE;
            highest = Integer.MIN_VALUE;
            newline = true;

        }
        sc.close();
        System.out.println(out);
    }
}

// import java.util.Scanner;

// public class DailyPrize {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int lines = Integer.parseInt(sc.next());
//         int out = 0;
//         int[] nums = new int[10];
//         for (int i = 0; i < lines; i++) {
//             int numInputs = Integer.parseInt(sc.next());
            
//             for (int j = nums.length-1; j < numInputs+nums.length; j++) {
//                 nums[j] = Integer.parseInt(sc.next());
//             }
//             int lowest = Integer.MAX_VALUE;
//             int highest = Integer.MIN_VALUE;
//             int lowestIndex = -1;
//             int highestIndex = -1;
//             for (int k = 0; k < nums.length; k++) {
//                 int num = nums[k];
//                 if (num > highest) {
//                     highest = num;
//                     highestIndex = k;
//                 }
//                 if (num < lowest) {
//                     lowest = num;
//                     lowestIndex = k;
//                 }
//             }
//             System.out.println(highest);
//             System.out.println(lowest);
            
//             if (lowestIndex >= 0){
//                 nums[lowestIndex] = 0;
//                 nums[highestIndex] = 0;
//                 out += highest - lowest;
//             }
            
//         }
//         sc.close();
//         System.out.println(out);
//     }
// }
// 