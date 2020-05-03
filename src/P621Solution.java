import org.junit.Test;

import java.util.Arrays;

public class P621Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        int max = 0;
        int countMax = 0;
        for (char c:tasks){
            counts[c - 'A'] += 1;
        }
        for (int i:counts){
            if (i > max){
                max = i;
                countMax = 1;
            }
            else if(i == max){
                countMax += 1;
            }
        }
        return Math.max(tasks.length, max + n * (max - 1) + countMax - 1);
    }
    public int leastInterval2(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        Arrays.sort(map);
        int time = 0;
        while (map[25] > 0) {
            int i = 0;
            while (i <= n) {
                if (map[25] == 0)
                    break;
                if (i < 26 && map[25 - i] > 0)
                    map[25 - i]--;
                time++;
                i++;
            }
            Arrays.sort(map);
        }
        return time;
    }
    @Test
    public void test(){
        char[] task = {'A', 'A','A','B','D','F','C'};
        int n = 2;
        leastInterval2(task,n);
        System.out.println(leastInterval2(task,n));
    }
}
