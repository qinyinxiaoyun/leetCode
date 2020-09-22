package com;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        int n = in.nextInt();
        double m = Double.MAX_VALUE;
        float[][] a = new float[n][2];
        a[0][0] = in.nextFloat();
        a[0][1] = in.nextFloat();
        for (int i = 1; i < n; i++) {
            a[i][0] = in.nextFloat();
            a[i][1] = in.nextFloat();
            double t = (a[i-1][0] - a[i][0])/(a[i][1] - a[i-1][1]);
            m = Math.min(m,Math.abs((t*(y-a[i][1])+(x-a[i][0]))/Math.sqrt(t*t+1)));
        }
        double s = (a[n-1][0] - a[0][0])/(a[0][1] - a[n-1][1]);
        m = Math.min(m,Math.abs((s*(y-a[0][1])+(x-a[0][0]))/Math.sqrt(s*s+1)));
        System.out.println(m);
    }
}
