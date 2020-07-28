package com.binarySearch;

import org.junit.Test;

public class P33Solution {
    public int search(int[] nums, int target) {
        int begin = 0,end = nums.length - 1;
        if (nums.length==0)return -1;
        while (begin != end){
            int mid = (begin + end)/2;
            if (target == nums[mid])return mid;
            if (nums[mid] >= nums[begin]){
                if (target < nums[mid] && target >= nums[begin])end = mid-1;
                else begin=mid+1;
            }
            else {
                if (target > nums[mid] && target <= nums[end])begin=mid+1;
                else end=mid-1;
            }
        }
        if (nums[begin]==target)return begin;
        else return -1;
    }

    @Test
    public void test(){
        int[] nums = {1,3};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
