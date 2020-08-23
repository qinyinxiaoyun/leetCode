package com.ali;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        for (int k = 1;k<n;k++){
            int b = 0;
            for (int i = 0;i<n-k+1;i++){
                int m = a[i];
                for (int j = 0;j<k;j++){
                    m = Math.min(m,a[i+j]);
                }
                b = Math.max(b,m);
            }
            System.out.print(b);
            System.out.print(" ");
        }
        int c = a[0];
        for (int i = 0;i<n;i++){
            c = Math.min(c,a[i]);
        }
        System.out.print(c);
    }
}
