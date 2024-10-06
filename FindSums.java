import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindSums {
    static boolean empty = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());
        int inputs = Integer.parseInt(sc.next());
        List<Integer> multiset = new ArrayList<Integer>();
        for (int i = 0; i < inputs; i++) {
            multiset.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(multiset, Collections.reverseOrder());
        // String add = "";
        // int possible = 0;
        Set<String> printedSubsets = new HashSet<>();
        System.out.println("Sums of " + target + ":");
        findSubsets(target, multiset, "", printedSubsets);
        if (empty == true) {
            System.out.println("NONE");
        }
        
        // for (int i = 0; i < inputs; i++) {
        //     if (nums[i] == target) {
        //         add = nums[i] + "";
        //     }
        //     for (int j = 1; j < inputs; j++) {
        //         if()
        //     }
        // }
        sc.close();
    }

    public static void findSubsets(int targetSum, List<Integer> multiset, String currentSubset,
            Set<String> printedSubsets) {
        if (targetSum == 0) {
            if (currentSubset.charAt(0) == '+') {
                currentSubset = currentSubset.substring(1);
            }
            System.out.println(currentSubset);
            empty = false;
            // System.out.println(empty);
            return;
        }
        if (targetSum < 0 || multiset.isEmpty()) {
            return;
        }
        int first = multiset.get(0);
        String newSubset = currentSubset + "+" + first;
        if (!printedSubsets.contains(newSubset)) {
            printedSubsets.add(newSubset);
            findSubsets(targetSum - first, multiset.subList(1, multiset.size()), newSubset, printedSubsets);
        }
        findSubsets(targetSum, multiset.subList(1, multiset.size()), currentSubset, printedSubsets);
    }
}
