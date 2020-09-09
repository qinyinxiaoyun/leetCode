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
        Arrays.sort(coins);
        if (coins.length == 0)return 0;
        int n = coins.length - 1;
        return changes(amount,coins,n,0);
    }
    private int changes(int amount, int[] coins,int n,int sum) {
        if (n < 0)return 0;
        if (amount < 0)return 0;
        if (amount == 0)return 1;
        int total = amount;
        while (total >= coins[n]){
            sum += changes(amount - coins[n],coins,n-1,sum);
            total -= coins[n];
        }
        sum += changes(amount,coins,n-1,sum);
        return sum;
    }
}
