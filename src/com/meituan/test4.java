package com.meituan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] t = new int[n][];
        for (int i = 0;i<n;i++){
            int[] c = new int[2];
            c[0] = in.nextInt();
            c[1] = in.nextInt();
            t[i] = c;
        }
        Arrays.sort(t, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]-o1[1])-(o2[0]-o2[1]);
            }
        });
        int s = 0;
        for (int i = 0;i<a;i++)s+=t[n-1-i][0];
        for (int i = 0;i<b;i++)s+=t[i][1];
        System.out.println(s);
    }
}
