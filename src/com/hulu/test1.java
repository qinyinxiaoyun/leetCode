package com.hulu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <n ; i++) {
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        long[][] t = new long[n+1][n+1];
        long s = tree(num,0,n,0,t);
        System.out.println(s);
    }
    public static long tree(int[] num,int j,int k,int s,long[][] t){
        int m = k-j;
        if (m==0 || m==1)return 1;
        if (t[j][k] != 0)return t[j][k];
        else {
            for (int i = j; i < k; i++) {
                if (i != 0 && num[i] == num[i - 1]) continue;
                long l = tree(num, j, i, s, t);
                long r = tree(num, i + 1, k, s, t);
                s += l * r;
            }
            t[j][k] = s;
            return s;
        }
    }
}
