package com.didi;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] a = new int[t];
        for (int i = 0; i <t ; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] s = new int[m][3];
            int c = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j <m ; j++) {
                s[j][0] = in.nextInt();
                s[j][1] = in.nextInt();
                s[j][2] = in.nextInt();
                if (s[j][2] <= k) {
                    c++;
                    set.add(s[j][0]);
                    set.add(s[j][1]);
                }
            }
            if (c>=m-1 && set.size()==m)a[i] = 1;
            else a[i] = 0;
        }
        for (int i = 0; i <t ; i++) {
            if (a[i] == 1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
