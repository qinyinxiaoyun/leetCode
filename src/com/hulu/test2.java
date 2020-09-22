package com.hulu;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[] t = new int[m];
        int[][] s = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = a[j][i];
            }
            Arrays.sort(s[i]);
            t[i] = s[i][n/2];
        }
        int r = t[0];
        for (int i:t){
            r = Math.min(r,i);
        }
        System.out.println(r);
    }
}
