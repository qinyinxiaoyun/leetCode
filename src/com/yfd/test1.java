package com.yfd;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = in.nextInt();
        }
        while (m > 0){
            int c = n/2;
            int[] q = new int[n];
            for (int i = 0; i <n-1 ; i+=2) {
                q[i] = a[i/2+c];
                q[i+1] = a[i/2];
            }
            if (n%2==1)q[n-1] = a[n-1];
            m--;
            a = q;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
