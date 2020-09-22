package com.aqy;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        if (n == 0){
            System.out.println(0);
            return;
        }
        int ans = 0,t=0,b=0;
        for (int i = 0; i <n ; i++) {
            for (int j = b; j <i ; j++) {
                if (s.charAt(j) == s.charAt(i)){
                    b=j;
                    ans = Math.max(ans,t);
                    t = i - j - 1;
                }
            }
            t += 1;
        }
        ans = Math.max(ans,t);
        System.out.println(ans);
    }
}
