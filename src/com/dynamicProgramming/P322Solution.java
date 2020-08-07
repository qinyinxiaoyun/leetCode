package com.dynamicProgramming;

import java.util.Arrays;

public class P322Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int ans = nums(coins,amount,new int[amount]);
        if (ans == Integer.MAX_VALUE)return -1;
        else return ans;
    }

    private int nums(int[] coins,int amount,int[] sum){
        int count = Integer.MAX_VALUE;
        if (amount == 0)return 0;
        if (amount > 0){
            if (sum[amount - 1] > 0)return sum[amount - 1];
            for (int i = coins.length-1;i>=0;i--){
                int a = nums(coins,amount - coins[i],sum);
                if (a < count-1)count = a + 1;
            }
            sum[amount - 1] = count;
        }
        return count;
    }
}
