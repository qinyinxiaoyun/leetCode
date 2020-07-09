import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class P739Solution {
    public int[] dailyTemperatures(int T[]){
        Stack<Integer> daily = new Stack<Integer>();
        int[] ans = new int[T.length];
        for (int i = T.length - 1;i >= 0;i--){
            if (!daily.empty() && T[i] < T[daily.peek()]) ans[i] = 1;
            else {
                while (!daily.empty() && T[i] > T[daily.peek()]){
                    daily.pop();
                    int index = daily.peek();
                    ans[i] = index - i;
                }
            }
            daily.push(i);
        }
        return ans;
    }

    public int[] dailyTemperatures2(int T[]){
        Stack<Integer> daily = new Stack<>();
        int[] ans = new int[T.length];
        for (int i = 0;i <T.length;i++){
            while (!daily.empty() && T[i] > T[daily.peek()]){
                int index = daily.pop();
                ans[index] = i - index;
            }
            daily.push(i);
        }
        return ans;
    }

    @Test
    public void test(){
        int T[] = new int[]{21,23,25,22,19,20,27};
        int[] ans = dailyTemperatures2(T);
        System.out.println(Arrays.toString(ans));
    }
}
