package com.didi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int k = 1;
        StringBuilder sb = new StringBuilder();
        while (k*n<=s.length()){
            for (int i = k*n - 1;i>=k*n-n;i--){
                sb.append(s.charAt(i));
            }
            k++;
        }
        for (int i = s.length()-1;i>=k*n-n;i--){
            sb.append(s.charAt(i));
        }
        String t = sb.toString();
        System.out.println(t);
    }
}
