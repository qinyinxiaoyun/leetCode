package com.wyzj;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long[] a = new long[(int) n];
        for (long i = 0;i<n;i++){
            a[(int) i] = in.nextLong();
        }
        long ans = 0;
        for (long i = 0;i < n;i++){
            ans += a[(int) i]/2;
        }
        System.out.println(ans);
    }
}
