package com.wyzj;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class exam1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0;i < n;i++){
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        if(n ==1){System.out.println(1);return;}
        Arrays.sort(a, (o1, o2) -> o1[1]-o2[1] );
        int[] m = new int[n];
        m[0] = 1;
        for(int i = 1;i < n;i++){
            int t = 0;
            for(int j = 0;j<i;j++){
                if(a[j][1]<a[i][1])t = Math.max(t,m[j]+1);
            }
            m[i] = t;
        }
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans = Math.max(ans,m[i]);
        }
        System.out.println(ans);
    }
}