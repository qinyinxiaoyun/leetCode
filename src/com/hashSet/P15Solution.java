package com.hashSet;
/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Notice that the solution set must not contain duplicate triplets.
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */

import java.util.*;

public class P15Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (nums[i] > 0)break;
            if (i>0 && nums[i] == nums[i-1])continue;
            while (j < k){
                int t = -nums[i];
                if (nums[j] + nums[k] == t) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (nums[j] == nums[j-1] && j < k)j++;
                    while (nums[k] == nums[k+1] && j < k)k--;
                }
                else if (nums[j] + nums[k] > t)k--;
                else j++;
            }
        }
        return ans;
    }
}
