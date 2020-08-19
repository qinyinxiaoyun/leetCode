package com.shopee;

public class test1 {
    public int maxSubArray (int[] nums) {
        int ans = 0;
        int sum = 0;
        for (int i = 0;i < nums.length;i++){
            sum += nums[i];
            if (sum < 0)sum = 0;
            if (sum > ans)ans = sum;
        }
        if (ans > 0)return ans;
        ans = Integer.MIN_VALUE;
        for (int i:nums){
            ans = Math.max(ans,i);
        }
        return ans;
    }
}
