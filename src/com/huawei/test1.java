package com.huawei;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] a = in.nextLine().split(" ");
        long[] l = new long[a.length];
        for (int i = 0;i<a.length;i++){
            l[i] = Long.parseLong(a[i]);
        }
        int n = l.length;
        for (int i = 0;i<n;i++){
            long t = 0;
            for (int j = 0;j<32;j+=2){
                int f1 = 0;
                int f2 = 0;
                if ((l[i]&(long)(1<<j))!=0)f1 = 1;
                if ((l[i]&(long)(1<<(j+1)))!=0)f2 = 1;
                t = (long)(f1*2+f2) + t<<2;
            }
            l[i] = t;
        }
        int[] t = new int[n];
        long[] w = new long[n];
        t[0] = (int) (l[n-1]^3);
        w[n-1] = l[n-1]>>2;
        for (int i = 0;i<n-1;i++){
            w[i] = l[i]>>2;
            t[i+1] = (int) (l[i]^3);
        }
        for (int i = 0;i<n;i++){
            l[i] = (t[i]<<30) + w[i];
            System.out.print(l[i]);
            System.out.print(" ");
        }
    }
}
