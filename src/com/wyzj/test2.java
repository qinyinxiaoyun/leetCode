package com.wyzj;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long e = in.nextLong();
        long em = in.nextLong();
        long m = in.nextLong();
        long mh = in.nextLong();
        long h = in.nextLong();
        long mid = (e+em+m+mh+h)/3;
        long min = Math.min(e+em,em+m+mh);
        min = Math.min(mh+h,min);
        System.out.println(Math.min(min, mid));
    }
}
