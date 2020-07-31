import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class P128Solution {
    public int longestConsecutive(int[] nums) {
        Set<Set> sets = new HashSet<>();
        int[] sum = new int[nums.length];
        int m = 0;
        if (0==nums.length)return 0;
        for (int i:nums) {
            Set<Integer> set1=null;
            Set<Integer> set2=null;
            for (Set item : sets) {
                if (item.contains(i-1))set1 = item;
                if (item.contains(i+1))set2 = item;
            }
            if (set1!=null&&set2!=null){
                set1.add(i);
                set1.addAll(set2);
                sets.remove(set2);
                m = Math.max(m,set1.size());
            }
            if (set1!=null&&set2==null){
                set1.add(i);
                m = Math.max(m,set1.size());
            }
            if (set1==null&&set2!=null){
                set2.add(i);
                m = Math.max(m,set2.size());
            }
            if (set1==null&&set2==null){
                Set<Integer> n = new HashSet<>();
                n.add(i);
                sets.add(n);
                m = Math.max(m,1);
            }
        }
        return m;
    }

    @Test
    public void test(){
        int[] nums = {200,3,100,1,4,2};
        int n = longestConsecutive(nums);
        System.out.println(n);
    }
}
