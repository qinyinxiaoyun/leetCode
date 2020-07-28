package com.binarySearch;

public class P34Solution {
    public  int[] searchRange(int[] nums, int target) {
        int hi = nums.length - 1;
        int low = 0;
        int[] rs = new int[2];
        // base case
        if(nums.length == 0)
            return new int[]{-1, -1 };

        //left side
        while(low < hi){
            int mid = low + (hi - low) /2;
            if(target > nums[mid]){
                low = mid + 1;
            }else{
                hi = mid;
            }
        }
        if(target == nums[low]){
            rs[0] = low;
        }else{
            rs[0] = -1;
        }

        //right side
        hi = nums.length - 1;
        while(low < hi){
            int mid = (low + (hi - low) /2 ) + 1;

            if(target < nums[mid]){
                hi = mid - 1;
            }else{
                low = mid;
            }
        }
        if(target == nums[hi]){
            rs[1] = hi;
        }else{
            rs[1] = -1;
        }

        return rs;
    }
}
