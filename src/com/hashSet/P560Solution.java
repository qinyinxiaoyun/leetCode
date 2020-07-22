package com.hashSet;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class P560Solution {
    /**
     * my wrong answer Not consider negative numbers
     * @param nums
     * @param k
     * @return number of subarrays
     */
    public int mysubarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0,j=0;i < nums.length;i++){
            sum += nums[i];
            while (j<i&&sum>k){
                sum -= nums[j];
                j ++;
            }
            if (k == sum){
                sum -= nums[j];
                j++;
                count += 1;
            }
        }
        return count;
    }

    /**
     * answer from leetcode
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

    @Test
    public void test(){
        int[] nums = {1,1,1,2,1};
        int n = 3;
        System.out.println(mysubarraySum(nums,n));
    }
}
