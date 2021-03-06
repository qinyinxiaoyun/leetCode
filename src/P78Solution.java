import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    /**
     * new solution use bits
     */
    public List<List<Integer>> subsets2(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int limit = 1<<n;
        for (int i = 0;i < limit;i++){
            List<Integer> item = new ArrayList<>();
            for (int j = 0;j < n;j++){
                if ((i&1<<j)!=0){
                    item.add(nums[j]);
                }
            }
            result.add(item);
        }
        return result;
    }
    @Test
    public void newTest(){
        int[] nums = {4,5,6};
        List<List<Integer>> res = subsets2(nums);
        System.out.println(res);
    }
    /**
     * backtrace
     */
    public List<List<Integer>> subsets3(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        adding(0,result,num,nums);
        return result;
    }
    private void adding(int i,List<List<Integer>> result,List<Integer> num,int[] nums){
        if (nums.length == i) {
            result.add(new ArrayList<>(num));
            return;
        }
        num.add(nums[i]);
        adding(i + 1,result,num,nums);
        num.remove(num.size() - 1);
        adding(i + 1,result,num,nums);
    }
    @Test
    public void test3(){
        int[] nums = {4,5,6};
        List<List<Integer>> res = subsets3(nums);
        System.out.println(res);
    }
}
