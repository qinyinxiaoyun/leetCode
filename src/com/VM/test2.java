package com.VM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                int k = in.nextInt();
                map.put(k,j);
            }
            int b = -1;
            for (int j = 0; j < m; j++) {
                int k = in.nextInt();
                if (!map.containsKey(k)){
                    a[i] = 1;
                    break;
                }
                int c = map.get(k);
                if (c < b){
                    a[i] = 1;
                    break;
                }
                b = c;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
