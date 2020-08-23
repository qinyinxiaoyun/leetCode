package com.ali;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0;i<t;i++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            int[] c = new int[n+m];
            for (int j = 0;j<n;j++)a[j] = in.nextInt();
            for (int k = 0;k<m;k++)b[k] = in.nextInt();
            for (int h = 0;h<n+m;h++)c[h] = in.nextInt();
            int j= 0,k = 0,h=0;
            for (;h<n+m;h++){
                if (j<n&&a[j]==c[h])j++;
                if (k<m&&b[k]==c[h])k++;
                if (j<n&&k<m&&a[j]!=c[h]&&b[k]!=c[h])break;
            }
            if (h == n+m)ans[i] = true;
        }
        for (int i = 0;i<t;i++){
            if (ans[i]) System.out.println("possible");
            else System.out.println("not possible");
        }
    }

}
