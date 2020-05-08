import java.util.Arrays;
import java.util.PriorityQueue;

public class P455Solution {
    public int findContentChildren(int[] g, int[] s) {
        PriorityQueue<Integer> child = new PriorityQueue<Integer>();
        PriorityQueue<Integer> sweet = new PriorityQueue<>();
        for (int i:g){
            child.add(i);
        }
        for (int j:s){
            sweet.add(j);
        }
        int result = 0;
        while (child.size()!=0 && sweet.size()!=0){
            if (child.peek() <= sweet.peek()){
                result += 1;
                child.remove();
            }
            sweet.remove();
        }
        return result;
    }
}
