package com.shopee;

public class test2 {
    public int missingNumber (int[] nums) {
        int sum = 0,n=-1;
        for (int i:nums){
            sum += i;
            n = Math.max(n,i);
        }
        return n*(n+1)/2-sum;
    }
}
