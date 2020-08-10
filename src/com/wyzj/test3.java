package com.wyzj;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0,k=0;
        for (int i = 0;i < n;i++){
            a[i] = in.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        while (a.length != k){
            String s = Integer.toString(sum);
            if (!s.contains("5")){
                System.out.println(sum);
                break;
            }
            else {
                sum -= a[k];
                k += 1;
            }
        }
        if (sum == 0) System.out.println(0);
    }
}
