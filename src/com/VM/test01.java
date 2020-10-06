package com.VM;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long n = in.nextLong();
        long[] l1 = new long[a];
        long[] l2 = new long[b];
        for (int i = 0; i < a; i++) {
            l1[i] = in.nextLong() % n;
        }
        for (int i = 0; i < b; i++) {
            l2[i] = in.nextLong() % n;
        }
        Arrays.sort(l1);
        Arrays.sort(l2);
        int i = 0,j=b-1;
        long c = n;
        while (i < a && j >= 0){
            long t = l1[i] + l2[j];
            if (t == n){
                System.out.println(0);
                return;
            }
            else if (t > n){
                c = Math.min(c,t-n);
                j--;
            }
            else {
                c = Math.min(c,n-t);
                i++;
            }
        }
        System.out.println(c);
    }
}
