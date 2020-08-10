package com.wyzj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[][] nums = new long[n][];
        for (int i = 0;i < n;i++){
            int k = in.nextInt();
            long[] num = new long[k];
            nums[i] = num;
            for (int j = 0;j < k;j++){
                num[j] = in.nextLong();
            }
        }
        for (int i = 0;i < n;i++){
            Arrays.sort(nums[i]);
            Set<Long> result = new HashSet<>();
            long sum = 0;
            for (long item:nums[i]){
                for (long res:result){
                    result.add(item + res);
                }
                sum += item;
            }
            System.out.println(nums[i][0]);
        }
    }
}
