package com.meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int k = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (long i = 1;i <= n/4;i++){
            String s = Long.toString(i*4);
            StringBuilder t = new StringBuilder();
            t.append(i).reverse();
            String c = t.toString();
            if (s.equals(c)){
                k ++;
                ans.add(i+" "+s);
            }
        }
        System.out.println(k);
        for (String s:ans){
            System.out.println(s);
        }
    }

}
