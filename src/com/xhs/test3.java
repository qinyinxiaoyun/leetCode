package com.xhs;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] num = new int[n][m];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                num[i][j] = in.nextInt();
            }
        }
    }
}
