package com.a360;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        for (int i = 0;i<m;i++){
            a[i] = in.nextInt();
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            res.add(i);
        }

        for (int i=0;i<m;i++){
            if (a[i]==1){

                int t = res.get(0);
                res.remove(0);
                res.add(t);
            }
            if (a[i]==2){
                if (i+1<m&&a[i+1]==2){
                    i++;
                    continue;
                }
                else {
                    for (int j = 0; j < n; j += 2) {
                        int k = res.get(j);
                        res.set(j, res.get(j + 1));
                        res.set(j + 1, k);
                    }
                }
            }
        }
        for (int i = 0;i<n;i++){
            System.out.print(res.get(i));
            System.out.print(" ");
        }
    }
}
