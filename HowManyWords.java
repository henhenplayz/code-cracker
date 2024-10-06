import java.util.PriorityQueue;
import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String out = sc.next().toLowerCase();
            //System.out.println(out);
            //out = out.replaceAll("[^a-zA-Z]", "");
            String[] words = out.split("[^a-zA-Z]");
            //System.out.println(out);

            for (String word :words) {
                if (pq.contains(word) == false) {
                    //System.out.println(!out.equals(""));
                    if (!word.equals("")) {
                        pq.add(word);
                        //System.out.println(out);
                    }
                }
            }
            
        }
        sc.close();
        while(pq.peek()!= null) {
            System.out.println(pq.poll());
        }
    }
}
