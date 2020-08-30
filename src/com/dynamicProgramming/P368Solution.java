package com.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:
 *
 * Si % Sj = 0 or Sj % Si = 0.
 *
 * If there are multiple solutions, return any subset is fine.
 * 动态规划，从小到大记录可以整除当前数字的序列最长数的坐标及序列长度。对于数字n，可以被n整除则可以被n的因数整除
 */
public class P368Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if (n==0)return new ArrayList<>();
        int[] len = new int[n];
        int[] index = new int[n];
        int big = 0,t = -1;
        index[0] = -1;
        Arrays.sort(nums);
        for (int i = 0; i < n;i++){
            len[i] = Math.max(1,len[i]);
            for (int j = i + 1;j<n;j++){
                if (nums[j] % nums[i]==0&&len[i]>=len[j]){
                    len[j] = len[i] +1;
                    index[j] = i;
                }
            }
            if (len[i] > big){
                big = len[i];
                t = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (big>0){
            ans.add(0,nums[t]);
            t = index[t];
            big--;
        }
        return ans;
    }
}
