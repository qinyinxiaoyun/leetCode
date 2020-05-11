import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P78Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        result.add(item);
        for (int i = 0;i < nums.length;i += 1){
            List<List<Integer>> newList = new ArrayList<>();
            for (List<Integer> t:result){
                List<Integer> j = new ArrayList<>(t);
                j.add(nums[i]);
                newList.add(j);
            }
            result.addAll(newList);
        }
        return result;
    }
    @Test
    public void test(){
        int[] nums = {1,2,3};
        List<List<Integer>> list = subsets(nums);
        System.out.println(list);
    }
}
