package com.dynamicProgramming;

import java.util.Arrays;

/**
 * Coin change2
 * You are given coins of different denominations and a total amount of money. Write a function to compute the number
 * of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.
 * Input: amount = 5, coins = [1, 2, 5]
 * Output: 4
 * Explanation: there are four ways to make up the amount:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 */
public class P518Solution {
    public int change(int amount,int[] coins){
        if (amount==0)return 1;
        if (coins.length == 0)return 0;
        int n = coins.length;
        int[] t = new int[amount+1];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=amount; j++) {
                if (j==coins[i])t[j] += 1;
                if (j>coins[i])t[j] += t[j-coins[i]];
            }
        }
        return t[amount];
    }
}
