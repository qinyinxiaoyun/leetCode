package com.VM;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < m; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int v = in.nextInt();
            for (int j = l; j <= r; j++) {
                long k = 1;

                for (int o = 1; o <= v; o++) {
                    k *= ((j-l+o)/o);
                }
                a[j-1] += k;
                a[j-1] = a[j-1] % 998244353;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
