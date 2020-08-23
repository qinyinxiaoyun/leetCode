package com.meituan;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] a = new String[n][];
        in.nextLine();
        for (int i = 0;i<n;i++){
            String[] c = new String[2];
            String s = in.nextLine();
            c = s.split(" ");
            a[i] = c;
        }
        int k = 0;
        String t = a[0][0];
        for (int i = 0;i<n;i++){
            if (a[i][1].equals(t)){
                k++;
                if (i != n-1)t = a[i+1][0];
            }
        }
        System.out.println(k);
    }
}
