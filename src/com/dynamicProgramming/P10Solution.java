package com.dynamicProgramming;

public class P10Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] flag = new boolean[m+1][n+1];
        flag[0][0] = true;
        for (int j = 2;j<n+1;j+=2){
            if (p.charAt(j - 1)=='*'&&flag[0][j-2]){
                flag[0][j] = true;
            }
        }
        for (int i = 0;i < m;i++){
            for (int j = 0;j<n;j++){
                if (s.charAt(i)==p.charAt(j)||p.charAt(j)=='.')flag[i+1][j+1] = flag[i][j];
                if (p.charAt(j)=='*'){
                    if (p.charAt(j - 1)!='.'&&p.charAt(j - 1)!=s.charAt(i - 1))flag[i+1][j+1] = flag[i+1][j-1];
                    else flag[i+1][j+1] = flag[i+1][j-1] || flag[i][j-1] || flag[i][j+1];
                }
            }
        }
        return flag[m][n];
    }
}
