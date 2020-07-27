package com.binarySearch;

import org.junit.Test;

import java.util.Arrays;

public class P300Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0||nums.length == 1)return nums.length;
        int[] len = new int[nums.length];
        for (int i = 1;i < nums.length;i ++){
            int max = 0;
            for (int j = 0;j < i;j ++){
                if (nums[j] < nums[i])max = Math.max(max,len[j] + 1);
            }
            len[i] = max;
        }
        int ans = 0;
        for (int i:len)ans = Math.max(i,ans);
        return ans + 1;
    }

    public int length(int[] nums){
        int[] tail = new int[nums.length];
        int size = 0;
        for (int x:nums){
            int i = 0,j = size;
            while (i != j){
                int mid = (i + j)/2;
                if (tail[mid] < x)i=mid+1;
                else j=mid;
            }
            tail[i] = x;
            if (i == size)size+=1;
        }
        return size;
    }

    @Test
    public void test(){
        int[] a = {10,9,2,5,3,7,101,18};
        System.out.println(length(a));
    }
}
