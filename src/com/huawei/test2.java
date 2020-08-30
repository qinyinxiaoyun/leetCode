package com.huawei;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split("],");
        String[] s1 = s[0].substring(1,s[0].length()).split(",");
        String[] s2 = s[1].substring(1,s[1].length()-1).split(",");
        int n = s1.length;
        int[] w = new int[n];
        int[] h = new int[n];
        for (int i = 0;i<n;i++){
            w[i] = Integer.parseInt(s1[i]);
            h[i] = Integer.parseInt(s2[i]);
        }
        int[] z = new int[n];
        z[0] = 0;
        for (int i = 1;i<n;i++){
            z[i] = z[i-1] + w[i-1];
        }
        long ans = 0;
        for (int i = 0;i<n;i++){
            if (w[i]<=0 || h[i]<0){
                System.out.println(0);
                return;
            }
            for (int j = 0;j<i;j++){
                if (h[i] < h[j]){
                    ans = Math.max(ans,h[j]*(z[i]-z[j]));
                    h[j] = h[i];
                }
            }
        }
        for (int i = 0;i<n;i++){
            ans = Math.max(ans,h[n-1]*(w[n-1]+z[n-1]-z[i]));
        }
        System.out.println(ans);
    }
}
