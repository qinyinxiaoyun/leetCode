package com.tree;

import org.junit.Test;

public class P96Solution {
    public int numTrees(int n) {
        if (n == 0)return 0;
        int m = totalNum(n);
        return m;
    }

    private int totalNum(int n){
        int sum = 0;
        if (0 == n||1 == n)return 1;
        for (int i = 0;i < n;i++) {
            sum += totalNum(i - 0) * totalNum(n - 1 - i);
        }
        return sum;
    }

    @Test
    public void test(){
        System.out.println(numTrees(5));
    }
}
