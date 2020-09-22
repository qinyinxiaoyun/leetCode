package com.yfd;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String[] str = new String[t];
        for (int i = 0; i <t ; i++) {
            str[i] = in.nextLine();
        }
        int[] a = new int[t];
        for (int i = 0; i <t ; i++) {
            String s = str[i];
            if (s.charAt(0) != '('){
                a[i] = -1;
                continue;
            }
            char c='#';
            int f=0,l=0;
            for (int j = 1; j <s.length() ; j++) {
                if (s.charAt(j) == ' ')continue;
                if (s.charAt(j) == '+' || s.charAt(j) == '-' || s.charAt(j) == '*') {
                    c = s.charAt(j);
                    j++;
                }
                StringBuilder s1 = new StringBuilder();
                while (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    s1.append(s.charAt(j));
                    j++;
                }
                f = Integer.parseInt(s1.toString());
                StringBuilder s2 = new StringBuilder();
                while (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    s2.append(s.charAt(j));
                    j++;
                }
                l = Integer.parseInt(s2.toString());
            }
            switch (c){
                case '+':
                    a[i] = ((f + l)%10000000+10000000)%10000000;
                    break;
                case '-':
                    a[i] = ((f - l)%10000000+10000000)%10000000;
                    break;
                case '*':
                    a[i] = ((f * l)%10000000+10000000)%10000000;
                    break;
                default:
                    a[i] = -1;
            }
        }
        for (int i = 0; i <t ; i++) {
            if (a[i] >= 0) System.out.println(a[i]);
            else System.out.println("invalid");
        }
    }
}
