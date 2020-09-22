package com.aqy;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String a[] = s.split(" ");
        int n = a.length;
        int[] t = new int[n];
        for (int i = 0; i <n ; i++) {
            t[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(t);
        System.out.println(t[n/2]);
    }
}
