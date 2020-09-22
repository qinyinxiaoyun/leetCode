package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class STtest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        while (in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            if (n==0 && m==0)break;
            String[] s = new String[n];
            in.nextLine();
            for (int i = 0; i < n; i++) {
                s[i] = in.nextLine();
            }
            if (n<m)l.add(1);
            else l.add(0);
        }
        for (int i:l){
            if (i==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
