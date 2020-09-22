package com.VM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int m = in.nextInt();
        double r = in.nextDouble();
        double[][] a = new double[m][2];
        double c = 0;
        DecimalFormat f = new DecimalFormat("#0.00");
        for (int i = 0; i < m; i++) {
            c += r;
            double s = c/n;
            double k = s%4;
            double t = k*n;
            if (k>=0 && k<1)a[i] = new double[]{t,0};
            if (k>=1 && k<2)a[i] = new double[]{n,t-n};
            if (k>=2 && k<3)a[i] = new double[]{3*n-t,n};
            if (k>=3)a[i] = new double[]{0,4*n-t};
            System.out.print(f.format(a[i][0]));
            System.out.print(" ");
            System.out.print(f.format(a[i][1]));
            System.out.println();
        }
    }
}
