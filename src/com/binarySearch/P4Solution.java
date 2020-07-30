package com.binarySearch;

import org.junit.Test;

public class P4Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length,n = nums2.length;
        int l = (m + n + 1)/2, r = (m + n + 2)/2;
        return (getKth(nums1,0,nums2,0,l)+getKth(nums1,0,nums2,0,r))/2.0;
    }

    public double getKth(int[] nums1,int aBegin,int[] nums2,int bBegin,int k){
        if (aBegin + 1 > nums1.length)return nums2[bBegin + k - 1];
        if (bBegin + 1 > nums2.length)return nums1[aBegin + k - 1];
        if (1 == k)return Math.min(nums1[aBegin],nums2[bBegin]);
        int aMid = Integer.MAX_VALUE,bMid = Integer.MAX_VALUE;
        if (aBegin + k/2 - 1 < nums1.length)aMid = nums1[aBegin + k/2 - 1];
        if (bBegin + k/2 - 1 < nums2.length)bMid = nums2[bBegin + k/2 - 1];
        if (aMid < bMid){
            return getKth(nums1,aBegin + k/2,nums2,bBegin,k-k/2);
        }
        else return getKth(nums1,aBegin,nums2,bBegin + k/2,k-k/2);
    }

    @Test
    public void test(){
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
