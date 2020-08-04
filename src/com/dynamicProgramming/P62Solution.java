package com.dynamicProgramming;

import org.junit.Test;

public class P62Solution {
    public int uniquePaths(int m, int n) {
        m-=1;
        n-=1;
        long sum = 1;
        for (int i = 1;i <= m;i++){
            sum *= (n+i);
            sum /= i;
        }
        return (int) sum;
    }

    @Test
    public void test(){
        int a = uniquePaths(6,3);
        System.out.println(a);
    }
}
