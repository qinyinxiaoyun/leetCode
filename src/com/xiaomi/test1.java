package com.xiaomi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] s = a.split(" ");
        int n = s.length;
        int[] c = new int[n];
        for (int i = 0; i <n ; i++) {
            boolean f1=false,f2=false,f3=false,f4=false;
            String str = s[i];
            if (str.length()<8 || str.length()>120){
                c[i] = 1;
                continue;
            }
            for (int j = 0; j <str.length() ; j++) {
                char k = str.charAt(j);
                if (k>='0' && k<='9') {
                    f1 = true;
                    continue;
                }
                if (k>='a' && k<='z'){
                    f2 = true;
                    continue;
                }
                if (k>='A' && k<='Z'){
                    f3 = true;
                }
                else {
                    f4 = true;
                }
            }
            if (f1 && f2 && f3 && f4)c[i] = 0;
            else c[i] = 2;
        }
        for (int m:c){
            System.out.println(m);
        }
    }
}
