package com.a360;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];
        in.nextLine();
        for (int i = 0;i < n;i++){
            a[i] = in.nextLine();
        }
        int s = 0;
        for (int i = 0;i < n;i++){
            int k = 1;
            if ((a[i].length()>10)||(a[i].length()==0))continue;
            for (int j = 0;j<a[i].length();j++){
                char c = a[i].charAt(j);
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    k = 0;
                    break;
                }
            }
            if (k==1)s++;
        }
        System.out.println(s);
    }
}
