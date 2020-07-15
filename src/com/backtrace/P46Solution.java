package com.backtrace;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P46Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        permutation2(nums,item,result,0);
        return result;
    }

    private void permutation(int[] nums,List<Integer> item,List<List<Integer>> result,int i){
        if (nums.length == item.size()) {
            result.add(new ArrayList<>(item));
        }
        else {
            for (int j = 0;j<=item.size();j++){
                item.add(j,nums[i]);
                permutation(nums,item,result,i + 1);
                item.remove(j);
            }
        }
    }

    private void permutation2(int[] nums,List<Integer> item,List<List<Integer>> result,int i){
        result.add(item);
        for (int k=0;k<nums.length;k++){
            List<List<Integer>> ans = new ArrayList<>();
            for (List<Integer> child:result){
                for (int j=0;j<=child.size();j++){
                    List<Integer> tmp = new ArrayList<>(child);
                    tmp.add(j,nums[k]);
                    ans.add(tmp);
                }
            }
            result.clear();
            result.addAll(ans);
        }
    }

    @Test
    public void test(){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
}
