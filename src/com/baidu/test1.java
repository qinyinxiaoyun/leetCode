package com.baidu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] a = new int[t][];
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] N = new int[n];
            int[] M = new int[m];
            int[] c = new int[n];
            for (int j = 0; j < n; j++) {
                N[j] = in.nextInt();
            }
            for (int j = 0; j <m ; j++) {
                M[j] = in.nextInt();
            }
            int j = 0,k=0;
            for (; j <n ; j++) {
                while (k<m && M[k] < N[j]){
                    k++;
                }
                c[j] = m-k;
            }
            a[i] = c;
        }
        for (int[] item:a){
            for (int i :item){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
